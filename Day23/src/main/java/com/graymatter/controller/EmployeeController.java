package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;
import com.graymatter.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return service.addEmployee(employee);
	}
	
	@GetMapping("/employee/city/{city}")
	public List<Employee> getAllEmployeesByCity(@PathVariable("city") String city)
	{
		return service.getAllEmployeeByCity(city);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getAllEmployeesById(@PathVariable("id") int id)throws ResourceNotFoundException
	{
		return service.getAllEmployeeById(id);
	}
	
	@GetMapping("/employee/deptid/{id}")
	public List<Employee> getAllEmployeesByDeptId(@PathVariable("id") int  id)
	{
		return service.getAllEmployeeByDeptId(id);
	}
	
	@GetMapping("/employee/name/{letter}")
	public List<Employee> findAllEmployeeStartsWith(@PathVariable("letter") String letter)
	{
		return service.findAllEmployeeStartsWith(letter);
	}
	

	
}
