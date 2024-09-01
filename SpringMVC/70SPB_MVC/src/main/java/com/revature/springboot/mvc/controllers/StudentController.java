package com.revature.springboot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springboot.mvc.model.Student;

//@Controller
@RestController  // @Controller+@ResponseBody
 public class StudentController {
	
	@GetMapping("/student")
	//@ResponseBody
	public Student getStudent() {
		// fetch data from DB
		Student s=new Student(1,"Jas");
		return s;
	}

}
