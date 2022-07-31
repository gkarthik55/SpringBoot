package com.spring.boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.Entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Integer>
{

}
