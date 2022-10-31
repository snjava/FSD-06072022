package com.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.institute.model.EmployeeModel;

@SpringBootApplication
public class SbIocIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbIocIntroApplication.class, args);
		
		//EmployeeModel emp = new EmployeeModel();
		
	}

}