package com.revature.springboot.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class InputFormController {

	@RequestMapping("/show-form")
	public String showForm() {
		return "myForm";
	}
	/*
	@RequestMapping("/processForm")
	public String formProcessing(HttpServletRequest request) {
		String name=request.getParameter("userName");
		System.out.println("Name ::: "+name);
		return "Welcome";
	}*/
	
	@RequestMapping("/processForm")
	public String formProcessing(@RequestParam("userName") String name,Model model) {
			String theName=name.toUpperCase();
			model.addAttribute("u_name", theName);
				System.out.println("Name ::: "+name);
		return "Welcome";
}
	/*@RequestMapping(value = "/someURL",method = RequestMethod.POST)
	@PostMapping("/someURL")
	@GetMapping
	@PutMapping
	@DeleteMapping */
	public String doSomeThing() {
		return null;
	}
	
	
}