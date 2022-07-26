package com.spring.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.demo.model.Person;

public interface PersonRepo extends CrudRepository<Person, Integer> 
{
	
}
