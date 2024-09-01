package com.jasdhir.springboot.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showStudentForm() {
		return "studentForm";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm(HttpServletRequest request) {
		String name=request.getParameter("studentName");
		System.out.println(name);
		return "studentDetails";
	}
	
	@RequestMapping("/processFormV2") // @PathVariable / @PathParam
	public String processStudentFormAgain(@RequestParam("studentName") String name) {
		System.out.println("The Name from Request Param is : "+name);
		return "studentDetails";
		
	}
}





