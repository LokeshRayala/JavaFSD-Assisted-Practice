package com.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.webservice")
public class ConsumeRestFulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestFulWebServiceApplication.class, args);
	}

}
