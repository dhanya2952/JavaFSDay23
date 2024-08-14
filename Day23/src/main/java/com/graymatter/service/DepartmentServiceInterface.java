package com.graymatter.service;

import java.util.List;

import com.graymatter.entities.Department;

public interface DepartmentServiceInterface {
	
	public List<Department> getAllDepatments();
	public Department addDepartment(Department department);

}
