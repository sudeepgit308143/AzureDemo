package com.nareshit.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.domain.Product;
import com.nareshit.repository.IProductRepository;

@RestController
@RequestMapping(value = "/productApi")
public class ProductController {
	@Autowired
	private IProductRepository prodRepo;

	@PostMapping(value = "/addProduct")
	public ResponseEntity<Iterator<Product>> addProduct(@RequestBody Product product) {
		prodRepo.save(product);
		Iterator<Product> prodList = prodRepo.findAll().iterator();
		return new ResponseEntity<Iterator<Product>>(prodList, HttpStatus.OK);

	}
	@GetMapping(value="/getAllProducts")
	public ResponseEntity<Iterator<Product>> getAllProducts() {
		Iterator<Product> prodList = prodRepo.findAll().iterator();
		System.out.println("Welcome to Azure,your deployment is successful");
		return new ResponseEntity<Iterator<Product>>(prodList, HttpStatus.OK);

	}
	

}
