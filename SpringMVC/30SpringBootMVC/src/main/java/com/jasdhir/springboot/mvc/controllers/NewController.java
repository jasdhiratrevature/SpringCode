package com.jasdhir.springboot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	
	@RequestMapping("/p1")
	public String getFirstPage() {
		return "first";
	}

}
