package com.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.exception")
public class SpringExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExceptionApplication.class, args);
	}

}
