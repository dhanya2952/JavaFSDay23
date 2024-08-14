package com.graymatter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.graymatter.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByCity(String city);

	//@Query(value="select * from employee e where e.departmentt_id=?",nativeQuery = true)
	//public List<Employee> findByDepartment(@Param("id") int id);
	public List<Employee> findByDepartmentDeptId(int id);
	
//	@Query(value="select * from employee  where emp_name like ?%",nativeQuery = true)
//	public List<Employee> findAllEmployeeStartWith(@Param("letter") String letter);//passing the param to the query
//	public List<Employee> findByEmpNameStartsWith(String letter);
	
	@Query("select e from Employee e where empName like ?1%") //?1= 1st paarmeter
	public List<Employee> findAllEmployeeStartWith(@Param("letter") String letter);//passing the param to the query
	
	
}
