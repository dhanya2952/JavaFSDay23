package com.graymatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

	public List<Employee> getAllEmployeeByCity(String city) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeByCity(city);
	}

	public Employee getAllEmployeeById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return dao.getAllEmployeesById(id);
	}

	public List<Employee> getAllEmployeeByDeptId(int id) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeByDeptId(id);
	}

	public List<Employee> findAllEmployeeStartsWith(String letter) {
		return  dao.findAllEmployeeStartsWith(letter);
		// TODO Auto-generated method stub
		
	}

}
