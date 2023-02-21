package com.login.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.login.demo")
@EnableAutoConfiguration
@SpringBootApplication

public class LoginFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginFormApplication.class, args);
	}

}
