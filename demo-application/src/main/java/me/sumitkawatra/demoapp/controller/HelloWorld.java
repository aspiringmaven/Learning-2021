package me.sumitkawatra.demoapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@Value("${TEST_KEY:defaultValue}")
	private String property;

	@GetMapping
	public String sayHello() {
		return "Hello World - Demo App " + System.getenv();
	}
	
	@GetMapping("/test")
	public String propertyTest() {
		return property;
	}
	
}
