package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Hey Spring framework, this is the class for which i need an object. Mention it as @Component.
@Component
//If we want to create a Prototype style of Object creation. Then mention it as @Scope(value="prototype"). By default its singleton.
@Scope(value="prototype")
public class Person 
{
	private int personId;
	private String personName;
	private String personLocation;
	
	@Autowired //Searches by Type
	//@Qualifier("laptop") //Searches by Name
	private Laptop laptop;
	
	public Person()
	{
		personId=0;
		personName="";
		personLocation="";
		
		//Spring framework always creates only a single instance of the Person object. It follows the Singleton Design Pattern. 
		System.out.println("Person default constructor is called.");
	}
	
	public Person(int personId, String personName, String personLocation) 
	{
		this.personId = personId;
		this.personName = personName;
		this.personLocation = personLocation;
		
		System.out.println("Person parametrized constructor is called.");
	}
	
	public int getPersonId() 
	{
		return personId;
	}

	public void setPersonId(int personId) 
	{
		this.personId = personId;
	}
	
	public String getPersonName() 
	{
		return personName;
	}
	
	public void setPersonName(String personName) 
	{
		this.personName = personName;
	}
	
	public String getPersonLocation() 
	{
		return personLocation;
	}
	
	public void setPersonLocation(String personLocation) 
	{
		this.personLocation = personLocation;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show()
	{
		System.out.println("In Show method");
		
		laptop.compile();
	}
}
