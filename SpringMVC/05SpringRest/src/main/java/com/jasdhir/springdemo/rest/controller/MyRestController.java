package com.jasdhir.springdemo.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class MyRestController {

	//@ResponseBody
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Rest Controller";
		
	}
}
