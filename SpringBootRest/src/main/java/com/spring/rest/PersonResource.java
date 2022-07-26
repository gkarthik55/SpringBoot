package com.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource 
{
	@Autowired
	PersonRepository personRepository;
	
	//@RequestMapping("persons")
	@GetMapping("persons")
	public List<Person> getPersonList()
	{
		List<Person> personList = (List<Person>) personRepository.findAll();

		return personList;
	}
}
