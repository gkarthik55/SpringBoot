package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.demo.dao.PersonRepo;
import com.spring.demo.model.Person;

@Controller
public class PersonController 
{
	@Autowired
	PersonRepo repo; 
	
	@RequestMapping("home")
	public String home()
	{
		System.out.println("In Home");
		
		return "home.jsp";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person p)
	{
		repo.save(p);
		
		return "home.jsp";
	}
}
