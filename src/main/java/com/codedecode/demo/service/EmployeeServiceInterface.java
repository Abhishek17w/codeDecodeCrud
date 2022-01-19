package com.codedecode.demo.service;

import java.util.List;

import com.codedecode.demo.entity.Employee;

public interface EmployeeServiceInterface {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
