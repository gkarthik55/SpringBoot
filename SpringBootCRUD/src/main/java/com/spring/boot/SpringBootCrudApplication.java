package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudApplication 
{
	public static void main(String[] args) 
	{
		System.out.println("Spring Boot CRUD Operation");
		
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}
}
