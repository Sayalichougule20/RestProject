package com.symbiosis.RestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.symbiosis.RestProject")
public class RestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestProjectApplication.class, args);
	}
}
