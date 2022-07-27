package com.spring.rest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// The @Entity annotation specifies that the class is an entity and is mapped to a database table.
public class Person 
{
	@Id
	// The @Id annotation specifies the primary key of an entity
	private int id;
	private String name;
	private String location;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
