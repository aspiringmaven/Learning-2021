package me.sumitkawatra.dummyapi.repository;

import org.springframework.stereotype.Repository;

import me.sumitkawatra.dummyapi.entity.Employee;

@Repository
public class EmployeeRepository {

	public Employee getById(Long id) {
		Employee emp = new Employee();
		emp.setId(111l);
		emp.setAge(30);
		emp.setName("Raja");
		return emp;
	}
}
