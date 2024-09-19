package com.springazure.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	public String message(){
		return " Springboot webapplication deployed into Azure ";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
