package com.george.springboot.mycrud.service;

import java.util.List;

import com.george.springboot.mycrud.entity.Employee;

public interface EmployeeService {
	
    public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
