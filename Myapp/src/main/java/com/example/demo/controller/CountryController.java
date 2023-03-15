package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService; 

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Country")
public class CountryController {
	@Autowired
	public CountryService countryService;
	@PostMapping
  public ResponseEntity<Country> saveCountry(@Valid @RequestBody Country country){
		return Optional.ofNullable(country);
				
	  
  }
}
