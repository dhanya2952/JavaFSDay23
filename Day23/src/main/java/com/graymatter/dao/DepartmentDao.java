package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Department;
import com.graymatter.repositories.DepartmentRepository;

@Repository
public class DepartmentDao {
	
	@Autowired
	DepartmentRepository repository;

	public List<Department> getAllDepatments()
	{
		return repository.findAll();
	}
	
	public Department addDepartment(Department department)
	{
		return repository.save(department);
	}

}