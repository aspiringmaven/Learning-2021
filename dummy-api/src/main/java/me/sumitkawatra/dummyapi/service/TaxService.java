package me.sumitkawatra.dummyapi.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.dummyapi.entity.Employee;
import me.sumitkawatra.dummyapi.repository.EmployeeRepository;
import me.sumitkawatra.dummyapi.repository.SalaryRepository;

@Service
public class TaxService {
	
	private static final BigDecimal THIRTY = BigDecimal.valueOf(30);

	private static final BigDecimal HUNDRED = BigDecimal.valueOf(100);

	private static final BigDecimal TEN = BigDecimal.valueOf(10);

	private static final BigDecimal TWENTY = BigDecimal.valueOf(20);

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SalaryRepository salaryRepository;
	
	@Autowired
	private TaxServiceHelper helper;
	
	
	public BigDecimal calculateTax(Long empId) {
		Employee emp = employeeRepository.getById(empId);
		BigDecimal salary = salaryRepository.getSalary(empId);
		BigDecimal tax = BigDecimal.ZERO;
		
		if(emp.getAge() > 60) {
			tax = salary.multiply(TEN).divide(HUNDRED);
		} else if (emp.getAge() > 50) {
			tax = salary.multiply(TWENTY).divide(HUNDRED);
		} else {
			tax = salary.multiply(THIRTY).divide(HUNDRED);
		}
		return tax;
	}
	
	public BigDecimal calculateTaxOtherWay(Long empId) {
		Employee emp = employeeRepository.getById(empId);
		BigDecimal salary = salaryRepository.getSalary(empId);
		BigDecimal tax = salary.multiply(helper.getTaxPercentage(emp.getAge())).divide(HUNDRED);
		return tax;
	}
	
	
}
