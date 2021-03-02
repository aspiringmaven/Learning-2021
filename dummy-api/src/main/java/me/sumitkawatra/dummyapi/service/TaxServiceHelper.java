package me.sumitkawatra.dummyapi.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class TaxServiceHelper {
	
	private static final BigDecimal THIRTY = BigDecimal.valueOf(30);

	private static final BigDecimal TEN = BigDecimal.valueOf(10);

	private static final BigDecimal TWENTY = BigDecimal.valueOf(20);

	public BigDecimal getTaxPercentage(int age) {
		
		BigDecimal taxSlab = THIRTY;
		
		if(age > 60 ) {
			taxSlab = TEN;
		} else if (age > 50) {
			taxSlab = TWENTY;
		}
		return taxSlab ;
	}

}
