package com.revature.springboot.jpa.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.revature.springboot.jpa.model.Customer;

public class RestWebClient {
public static void main(String[] args) {
	RestTemplate restTemplate=new RestTemplate();
	/*
	 * ResponseEntity<Customer> responseEntity=
	 * restTemplate.getForEntity("http://localhost:8080/customer/23",
	 * Customer.class); System.out.println(responseEntity.getStatusCodeValue());
	 * System.out.println(responseEntity.getBody());
	 */
	
	Customer customer=restTemplate.getForObject("http://localhost:8080/customer/23", Customer.class);
	System.out.println(customer);
}
}
