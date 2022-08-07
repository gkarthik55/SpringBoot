package com.spring.boot.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.Entity.Employee;
import com.spring.boot.Exception.BusinessException;
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
		
		try
		{
			if(employeeList.isEmpty())
			{
				throw new BusinessException("604", "The Employee List is currently Empty.");
			}
		}
		catch(Exception e)
		{
			throw new BusinessException("605", "Something went wrong while fetching all the Employees."+ e.getMessage());
		}

		return employeeList;
	}

	@Override
	public Employee getEmployeeById(Integer id) 
	{
		try
		{
			Employee emp = repo.findById(id).get();

			return emp;
		}
		catch(IllegalArgumentException e)
		{
			throw new BusinessException("606", "Given Employee Id is Null."+ e.getMessage());
		}
		catch(NoSuchElementException e)
		{
			throw new BusinessException("607", "Given Employee Id doesnt exists in DB");
		}
	}

	@Override
	public Employee addEmployee(Employee employee) 
	{
		if(employee.getEname().isEmpty() || employee.getEname().length() == 0)
		{
			throw new BusinessException("601", "Please send proper name, Its blank.");
		}
		
		try
		{
			Employee emp = repo.save(employee);
			return emp;
		}
		catch(IllegalArgumentException e)
		{
			throw new BusinessException("602", "Given Employee is Null."+ e.getMessage());
		}
		catch(Exception e)
		{
			throw new BusinessException("603", "Something went wrong in service layer."+ e.getMessage());
		}
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
