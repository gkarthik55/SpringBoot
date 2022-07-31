package com.spring.boot.Service;

import java.util.List;

import com.spring.boot.Entity.Employee;

public interface EmployeeServiceInterface 
{
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(Integer id);
	
	public Employee addEmployee(Employee employee);
	
	public String deleteEmployee(Integer id);
	
	public Employee updateEmployee(Integer id, Employee employee);
}

