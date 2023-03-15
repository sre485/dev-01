package com.example.demo.entity;

import java.util.List;

import com.example.demo.enums.CompanyType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Table
@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer companyId;
	@NotNull(message = "companyName should not be null")
	@NotEmpty(message = "companyName should not be Empety")
	@Size(min = 5,max = 20)
	private String companyName;
	@Enumerated(EnumType.STRING)
	private CompanyType companyType;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "company.fk",referencedColumnName ="companyId" )
	private List<Employee>Employecomes;

}
