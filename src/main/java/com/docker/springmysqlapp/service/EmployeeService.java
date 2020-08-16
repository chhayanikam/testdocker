package com.docker.springmysqlapp.service;

import java.util.List;

import com.docker.springmysqlapp.model.Employee;



public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}