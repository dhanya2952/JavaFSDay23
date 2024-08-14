package com.graymatter.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

public class Department {

	private String deptName;
	@Id
	private int deptId;
	@OneToMany(mappedBy = "department")
	//list means onetomany -----mappedBy name must be same as the one declared on the emp entity
	@JsonIgnore
	private List<Employee> empList;
}
