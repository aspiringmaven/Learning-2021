package me.sumitkawatra.dummyapi.util;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class SleepingTest {
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println("Sleeping..."+LocalDateTime.now());
		TimeUnit.SECONDS.sleep(10);
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Sleeping..."+LocalDateTime.now());
		TimeUnit.SECONDS.sleep(10);
	}
	
	@Test
	public void test3() throws InterruptedException {
		System.out.println("Sleeping..."+LocalDateTime.now());
		TimeUnit.SECONDS.sleep(10);
	}
	
	@Test
	public void test4() throws InterruptedException {
		System.out.println("Sleeping..."+LocalDateTime.now());
		TimeUnit.SECONDS.sleep(10);
	}
	
	@Test
	public void test5() throws InterruptedException {
		System.out.println("Sleeping..."+LocalDateTime.now());
		TimeUnit.SECONDS.sleep(10);
	}

}
