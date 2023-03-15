package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Table
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@NotNull(message = "empName should not be null")
	@NotEmpty(message = "empName should not be empty")
	@Size(min = 4, max =20)
	private String empName;
	
	@NotNull(message = "empSalery should not be null")
	@NotEmpty(message = "empSalery should not be empty")
	@Size(min = 10000, max =50000)
	private Integer empSalery;

}
