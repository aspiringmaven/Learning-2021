package me.sumitkawatra.ecsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"me.sumitkawatra.ecsapp"})
public class EcsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcsAppApplication.class, args);
	}

}
