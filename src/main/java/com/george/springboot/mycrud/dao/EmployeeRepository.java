package com.george.springboot.mycrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.george.springboot.mycrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
