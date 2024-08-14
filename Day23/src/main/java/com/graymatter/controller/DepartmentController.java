package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Department;

import com.graymatter.service.DepartmentService;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {
	
	@Autowired
	DepartmentService service;

	@GetMapping("/department")
	public List<Department> getAllDepatments()
	{
		return service.getAllDepatments();
	}
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department department)
	{
		return service.addDepartment(department);
	}

}
