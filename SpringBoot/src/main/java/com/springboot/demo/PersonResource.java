package com.springboot.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource 
{
	//@RequestMapping("persons")
	// The @GetMapping annotation is a specialized version of @RequestMapping annotation 
	// that acts as a shortcut for @RequestMapping(method = RequestMethod. GET). 
	@GetMapping("persons")
	public List<Person> getPersonList()
	{
		List<Person> personList = new ArrayList<>();
		
		personList.add(new Person(10, "Karthik G", "Mysore"));
		personList.add(new Person(11, "Srikanth Rp", "Tumkur"));
		personList.add(new Person(12, "Pavan Kumar Kn", "Bangalore"));
		
		return personList;
	}
}
