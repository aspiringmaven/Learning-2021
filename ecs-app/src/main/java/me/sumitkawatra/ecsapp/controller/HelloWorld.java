package me.sumitkawatra.ecsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@Autowired
	private Environment env;

	@GetMapping
	public String sayHello() {
		return "Hello World - Demo App " + System.getenv();
	}
	
	@GetMapping("/test")
	public String[] propertyTest() {
		return env.getActiveProfiles();
	}
	
}
