package me.sumitkawatra.dummyapi;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;

public class PlatformationsTest {
	
	@Test
	@EnabledOnOs(value = org.junit.jupiter.api.condition.OS.MAC,  disabledReason = "We need Mac PC ")
	@EnabledOnJre(value = org.junit.jupiter.api.condition.JRE.JAVA_11, disabledReason = "We need JRE 11")
	public void windowsPC() {
		System.out.println("This is Mac PC.");
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
	public void testJRE() {
		System.out.println("This is Java 11.");
	}
	
	@Test
	public void readyness() {
		boolean assumptionIsFileAvailable = false;
		Assumptions.assumeTrue(assumptionIsFileAvailable,"expecting true here");
	}
	
	@Test
	@EnabledIf("isHappy")
	public void teasteAmrutWhisky() {
		System.out.println("Having Amrut Whisky");
	}
	
	@Test
	@DisabledIf("isWeedTime")
	public void itsWeedTime() {
		System.out.println("High Time....");
	}
	
	public boolean isHappy() {
		return true;
	}
	
	public boolean isWeedTime() {
		return false;
	}
	
}