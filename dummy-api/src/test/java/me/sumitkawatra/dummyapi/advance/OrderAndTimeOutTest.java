package me.sumitkawatra.dummyapi.advance;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.SAME_THREAD)
public class OrderAndTimeOutTest {
	
	@Order(1)
	@Test
	public void test1() {
		System.out.println("Order  1 ");
	}
	
	@Test
	@Order(2)
	public void test2() {
		System.out.println("Order  2 ");
	}
	
	@Test
	@Order(3)
	public void test3() {
		System.out.println("Order  3 ");
	}
	
	@Test
	@Order(4)
	public void test4() {
		System.out.println("Order  4 ");
	}
	
	@Test
	@Order(5)
	public void test5() {
		System.out.println("Order  5 ");
	}
	
	@Test
	@Timeout(unit = TimeUnit.MINUTES, value = 1)
	public void test6() {
		System.out.println("Order  6 ");
	}

}
