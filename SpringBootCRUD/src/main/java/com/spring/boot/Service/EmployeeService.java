package com.spring.boot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.Entity.Employee;
import com.spring.boot.Repository.EmployeeCrudRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface 
{
	@Autowired
	EmployeeCrudRepo repo;

	@Override
	public List<Employee> getAllEmployees() 
	{
		List<Employee> employeeList = repo.findAll();

		return employeeList;
	}

	@Override
	public Employee getEmployeeById(Integer id) 
	{
		Employee emp = repo.findById(id).orElse(new Employee());

		return emp;
	}

	@Override
	public Employee addEmployee(Employee employee) 
	{
		Employee emp = repo.save(employee);

		return emp;
	}

	@Override
	public String deleteEmployee(Integer id) 
	{
		// Employee emp = repo.getOne(id);
		// repo.delete(emp);

		repo.deleteById(id);

		return "Employee deleted successfully.";
	}

	@Override
	public Employee updateEmployee(Integer id, Employee employee) 
	{
		repo.save(employee);

		return employee;
	}
}
