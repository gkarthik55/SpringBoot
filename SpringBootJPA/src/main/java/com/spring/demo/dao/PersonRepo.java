package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import com.spring.demo.model.Person;

// CrudRepository is the Basic Interface for CRUD operations. 
//	public interface PersonRepo extends CrudRepository<Person, Integer> 

public interface PersonRepo extends JpaRepository<Person, Integer> 
{
	//Customized Methods
	
	//	List<Person> findByTechnology(String technology);
	//	
	//	List<Person> findByPersonIdGreaterThan(int personId);
	//	
	//	@Query("from Person where technology=?1 order by personName")
	//	List<Person> findByTechnologySorted(String technology);
}
