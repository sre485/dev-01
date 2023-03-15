package com.example.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Data
@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer countryId;
	@NotNull(message = "CountryName should not be null")
	@NotEmpty(message = "countryName should not be empety")
	@Size(min=3,max = 20)
	private String countryNAME;
	@NotNull(message = "CountryCode should not be null")
	@NotEmpty(message = "countryCode should not be empety")
	@Size(min=3,max = 3)
	private Integer countryCode;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "country-fk",referencedColumnName = "countryId")
	private List<Company> companies; 
	

}
