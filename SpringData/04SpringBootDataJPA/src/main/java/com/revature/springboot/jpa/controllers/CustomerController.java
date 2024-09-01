package com.revature.springboot.jpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springboot.jpa.model.Customer;
import com.revature.springboot.jpa.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/customer")
	public void addCustomer(@RequestBody Customer customer) {
		// should be able to add customer
		customerRepository.save(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Integer id) {
		return customerRepository.findById(id);
	}
	
	@GetMapping("/customer/last/{name}")
	public List<Customer> getCustomerByLastName(@PathVariable String name) {
		return customerRepository.findByLastName(name);
	}
	
}
