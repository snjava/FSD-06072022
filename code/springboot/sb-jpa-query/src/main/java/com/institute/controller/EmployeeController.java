package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.CustomResponse;
import com.institute.entity.Employee;
import com.institute.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/create-emp")
	public CustomResponse saveEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		CustomResponse response = new CustomResponse(201, "Employee Register Successfully...");
		return response;
	}
	
	
	@GetMapping("/get-all-emp")
	public CustomResponse getAllEmployee() {
		List<Employee> empList = employeeRepository.findAll();
		CustomResponse response = new CustomResponse(200, empList, "List of All Employee");
		return response;
	}
	
	@PutMapping("/update-emp-city")
	public CustomResponse updateEmpCity(@RequestParam("city") String city, @RequestParam("id") int id) {
		//employeeRepository.updateEmpCityHql(city, id);
		employeeRepository.updateEmpCitySql(city, id);
		CustomResponse response = new CustomResponse(203, "Employee City has been updated...");
		return response;
	}
	
	
	@GetMapping("/get-by-city/{ct}")
	public CustomResponse getEmpByCity(@PathVariable("ct") String city) {
		List<Employee> empList = employeeRepository.getEmpByCity(city);
		CustomResponse response = new CustomResponse(200, empList, "List of Employee from City " + city);
		return response;
	}
	
}
