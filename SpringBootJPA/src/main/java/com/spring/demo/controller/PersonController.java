package com.spring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.demo.dao.PersonRepo;
import com.spring.demo.model.Person;

@RestController
//@RestController 	If you provide RestController the JSP form will not work.
public class PersonController {
	
	@Autowired
	PersonRepo repo;

	@RequestMapping("home")
	public String home() 
	{
		return "home.jsp";
	}

	@RequestMapping("/addPerson")
	public String addPerson(Person p) 
	{
		repo.save(p);

		return "home.jsp";
	}

	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam int personId) 
	{
		ModelAndView modelAndView = new ModelAndView("showPerson.jsp");
		
		//Predefined Method - findById
		System.out.println(repo.findById(personId).orElse(new Person()));
				
		//Customized Methods
		//		System.out.println(repo.findByTechnology("java"));
		//		
		//		System.out.println(repo.findByPersonIdGreaterThan(20));
		//		
		//		System.out.println(repo.findByTechnologySorted("java"));
		//		modelAndView.addObject(person);
		
		return modelAndView;
	}
	
	//Example for Path Param:
	//All Persons
	@RequestMapping("/persons")
	@ResponseBody
	public List<Person> getPersons() 
	{
		return repo.findAll();
	}
	
	//Single Person
	@RequestMapping("/person/{pid}")
	@ResponseBody
	public Optional<Person> findPerson(@PathVariable("pid") int pid) 
	{
		return repo.findById(pid);
	}
	
	//Add Person
	@PostMapping("/addNewPerson")
	public Person addNewPerson(@RequestBody Person p) 
	{
		repo.save(p);

		return p;
	}
	
	//Delete Person
	@DeleteMapping("/deletePerson/{pid}")
	public String deletePerson(@PathVariable("pid") int pid) 
	{
		Person p = repo.getOne(pid);
		
		repo.delete(p);

		return "Deleted";
	}
	
	//Update Person
	@PutMapping("/updatePerson/{pid}")
	public Person updatePerson(@PathVariable("pid") int pid, @RequestBody Person p1) 
	{
		Person p = repo.getOne(pid);
		repo.delete(p); // Delete
		
		repo.save(p1); // Save

		return p1;
	}
}
