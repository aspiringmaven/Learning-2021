package me.sumitkawatra.dummyapi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestLifeCycle {
	
	@BeforeAll
	public static void init() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("\tBefore Each");
	}
	
	@Test
	public void testCase01() {
		System.out.println("\t\t Test Case -- 01");
	}
	
	@Test
	public void testCase02() {
		System.out.println("\t\t Test Case -- 02");
	}
	
	@Test
	public void testCase03() {
		System.out.println("\t\t Test Case -- 03");
	}
	
	@Test
	@Disabled
	public void testCase04() {
		System.out.println("\t\t Test Case -- 04");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("\tAfter Each");
	}
	
	@AfterAll
	public static void destroy() {
		System.out.println("After All");
	}
	
	

}
