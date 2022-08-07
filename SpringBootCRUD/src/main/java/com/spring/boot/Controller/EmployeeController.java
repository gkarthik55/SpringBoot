package com.spring.boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.Entity.Employee;
import com.spring.boot.Exception.BusinessException;
import com.spring.boot.Exception.ControllerException;
import com.spring.boot.Service.EmployeeServiceInterface;

@RestController
@RequestMapping("/crud")
public class EmployeeController 
{
	@Autowired
	EmployeeServiceInterface employeeServiceInterface;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> emp = employeeServiceInterface.getAllEmployees();
		
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(emp, HttpStatus.OK);
		
		return response;
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id)
	{
		Employee emp = employeeServiceInterface.getEmployeeById(id);
		
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, HttpStatus.OK);
		
		return response;
	}
	
	@PostMapping("/addemployee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee)
	{
		try
		{
			Employee emp = employeeServiceInterface.addEmployee(employee);
			
			ResponseEntity<Employee> response = new ResponseEntity<>(emp, HttpStatus.CREATED);
			
			return response;
		}
		catch(BusinessException e)
		{
			ControllerException ce = new ControllerException(e.getErrorCode(),e.getErrorMessage());
			
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST );
		}
		catch(Exception e)
		{
			ControllerException ce = new ControllerException("608", "Something went wrong in the emplooyee controller");
			
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST );
		}
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id)
	{
		String str = employeeServiceInterface.deleteEmployee(id);
		
		ResponseEntity<String> response = new ResponseEntity<>(str, HttpStatus.OK);
		
		return response;
	}
	
	@PutMapping("/updateemployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee employee)
	{
		Employee emp = employeeServiceInterface.updateEmployee(id, employee);
		
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, HttpStatus.OK);
		
		return response;
	}
}
