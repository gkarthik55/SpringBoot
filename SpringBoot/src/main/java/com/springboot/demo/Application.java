package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Spring Boot.");
		
		//Initialize the Spring container here in this statement which will be in JVM. 
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//Get the Person Object using the context. 
		Person p = context.getBean(Person.class); 
		System.out.println(p);
		p.show();
		
		//Even if we create another instance, we get the previously created instance only. 
		Person p1 = context.getBean(Person.class); 
		System.out.println(p1);
		p1.show();
		
	}
}
