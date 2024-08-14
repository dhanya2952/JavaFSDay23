package com.graymatter.service;

import java.util.List;

import com.graymatter.entities.Employee;

public interface EmployeeServiceInterface {
	
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployeeByCity(String city);
	public List<Employee> getAllEmployeeByDeptId(int id);
	public List<Employee> findAllEmployeeStartsWith(String letter);

}
