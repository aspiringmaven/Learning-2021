package me.sumitkawatra.dummyapi.service;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import me.sumitkawatra.dummyapi.entity.Employee;
import me.sumitkawatra.dummyapi.repository.EmployeeRepository;
import me.sumitkawatra.dummyapi.repository.SalaryRepository;

@ExtendWith(MockitoExtension.class)
//@Execution(ExecutionMode.CONCURRENT)
class TaxServiceTest {
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	@Mock
	private SalaryRepository salaryRepository;
	
	@Spy
	private TaxServiceHelper helper;
	
	@InjectMocks
	private TaxService taxService;


	@Test
	@DisplayName("When Epployee Age is 12")
	void testCalculateTaxWhenEmpAgeIs12() {
		//Given
		Long empId = 111l;
		Employee employeeData = new Employee(empId, "Name", 12);
		BigDecimal salary = BigDecimal.valueOf(1000);
		
		//When
		Mockito.when(employeeRepository.getById(empId)).thenReturn(employeeData);
		Mockito.when(salaryRepository.getSalary(empId)).thenReturn(salary);
		
		//Then 
		BigDecimal calculatedTax = taxService.calculateTax(empId);
		
		BigDecimal expectedTax = BigDecimal.valueOf(300);
		
		//Assert
		Assertions.assertEquals(expectedTax , calculatedTax, "Was expecting ");
		
		//Verify
		Mockito.verify(employeeRepository, Mockito.times(1)).getById(empId);
		Mockito.verify(salaryRepository, Mockito.times(1)).getSalary(empId);
		
	}
	
	@Test
	@DisplayName("When Epployee Age is 51")
	void testCalculateTaxOtherWayWhenEmpAgeIs51() {
		
		//Given
		Long empId = 111l;
		int age = 51;
		Employee employeeData = new Employee(empId, "Name", age );
		BigDecimal salary = BigDecimal.valueOf(1000);
		
		//When
		Mockito.when(employeeRepository.getById(empId)).thenReturn(employeeData);
		Mockito.when(salaryRepository.getSalary(empId)).thenReturn(salary);
		
		//Then 
		BigDecimal calculatedTax = taxService.calculateTaxOtherWay(empId);
		
		//Assert
		BigDecimal expectedTax = BigDecimal.valueOf(200);
		Assertions.assertEquals(expectedTax , calculatedTax, "Was expecting ");
		
		//Verify
		Mockito.verify(employeeRepository, Mockito.times(1)).getById(empId);
		Mockito.verify(salaryRepository, Mockito.atLeast(1)).getSalary(empId);
		
	}

}