package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Spring Boot");
		
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
}
