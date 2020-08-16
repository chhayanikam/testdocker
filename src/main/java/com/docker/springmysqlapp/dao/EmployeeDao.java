package com.docker.springmysqlapp.dao;

import java.util.List;

import com.docker.springmysqlapp.model.Employee;
public interface EmployeeDao {
	List<Employee> getAllEmployees();

	void insertEmployee(Employee employee);
}