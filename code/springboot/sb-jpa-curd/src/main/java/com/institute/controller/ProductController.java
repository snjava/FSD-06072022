package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Product;
import com.institute.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository repository;
	
	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {
		repository.save(product);
		return "Product Save Successfully";
	}
	
	@GetMapping("/get-product-by-id/{id}")
	public Product getProductById(@PathVariable int id) {
		return repository.findById(id).get();
	}
	
	@GetMapping("/get-products")
	public List<Product> getAllProduct() {
		return repository.findAll();
	}
	
}
