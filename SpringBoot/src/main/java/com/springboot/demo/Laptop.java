package com.springboot.demo;

import org.springframework.stereotype.Component;

@Component("laptop")
//@Component("laptop") we can change the default instance name created Spring framework.
public class Laptop {

	private int laptopId;
	private String laptopName;

	public Laptop() 
	{
	}

	public Laptop(int laptopId, String laptopName) 
	{
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	public void compile()
	{
		System.out.println("Compiling..");
	}
	
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + "]";
	}
}
