package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;
import com.graymatter.repositories.EmployeeRepository;

@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository repository;

	public List<Employee> getAllEmployees()
	{
		return repository.findAll();
	}
	
	public Employee addEmployee(Employee employee)
	{
		return repository.save(employee);
	}

	public List<Employee> getAllEmployeeByCity(String city) {
		// TODO Auto-generated method stub
		return repository.findByCity(city);
	}

	public Employee getAllEmployeesById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("no such id found"));
	}

	public List<Employee> getAllEmployeeByDeptId(int id) {
		// TODO Auto-generated method stub
		return repository.findByDepartmentDeptId(id);
	}

	public List<Employee> findAllEmployeeStartsWith(String letter) {
		// TODO Auto-generated method stub
		return repository.findAllEmployeeStartWith(letter);
	}
	
	
}
