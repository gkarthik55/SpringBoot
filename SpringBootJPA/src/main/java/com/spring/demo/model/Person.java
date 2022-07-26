package com.spring.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person 
{
	@Id
	int personId;
	String personName;
	String technology;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", technology=" + technology + "]";
	}
}
