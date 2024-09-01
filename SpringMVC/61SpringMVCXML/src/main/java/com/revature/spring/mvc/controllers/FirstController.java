package com.revature.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

	@RequestMapping("/hi")
	public String showHello() {
		return "hello";
	}
	
	@RequestMapping("/abc")
	public String showPage() {
		return "page1";
	}
}
