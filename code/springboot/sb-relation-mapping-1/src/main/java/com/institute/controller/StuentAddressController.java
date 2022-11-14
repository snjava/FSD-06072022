package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.StudentAddress;
import com.institute.repository.StudentAddressRepository;

@RestController
public class StuentAddressController {
	
	@Autowired
	private StudentAddressRepository addressRepository;
	
	@PostMapping("/create-stud-address")
	public ResponseEntity<String> saveAddress(@RequestBody StudentAddress address){
		addressRepository.save(address);
		return new ResponseEntity<String>("Student Address Created Successfully..", HttpStatus.CREATED);
	}
	
	@GetMapping("/get-student-address/{id}")
	public ResponseEntity<StudentAddress> getAddress(@PathVariable("id") int id) {
		StudentAddress add = addressRepository.findById(id).get();
		return new ResponseEntity<StudentAddress>(add, HttpStatus.CREATED);
	}

}
