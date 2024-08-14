package com.graymatter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private double empSal;
	private String city;
	@ManyToOne
	@JoinColumn(name="departmenttId",referencedColumnName = "deptId")
	//Joincolumn(name= name of the njoin col on the Emp table, ref=name of the mapped attr in dept table 
	private Department department;

}
