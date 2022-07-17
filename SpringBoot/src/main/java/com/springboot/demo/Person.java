package com.springboot.demo;

public class Person 
{
	private int personId;
	private String personName;
	private String personLocation;
	
	public Person(int personId, String personName, String personLocation) 
	{
		this.personId = personId;
		this.personName = personName;
		this.personLocation = personLocation;
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
}
