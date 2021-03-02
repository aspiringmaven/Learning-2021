package me.sumitkawatra.dummyapi.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

@Repository
public class SalaryRepository {
	
	public BigDecimal getSalary(Long empId) {
		return BigDecimal.valueOf(1000l);
	}

}
