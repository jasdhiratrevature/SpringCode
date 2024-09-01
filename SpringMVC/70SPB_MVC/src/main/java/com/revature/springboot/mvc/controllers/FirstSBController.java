package com.revature.springboot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstSBController {

	@RequestMapping("/hello")
	public String showHello() {
		return "hello";
	}
}
