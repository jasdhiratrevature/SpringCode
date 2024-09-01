package com.revature.springboot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@RequestMapping("/index")
	public String showindex() {
		return "index";
	}
	
	/*
	 * @RequestMapping("/processForm") public String welcomePage() { return
	 * "welcome"; }
	 */
	/*
	 * @RequestMapping("/processForm") public String welcomePage(HttpServletRequest
	 * request,Model model) { String name=request.getParameter("userName"); String
	 * nameInCaps=name.toUpperCase(); model.addAttribute("uName", nameInCaps);
	 * return "welcome"; }
	 */
	
	
	@RequestMapping("/processForm") 
	public String welcomePage(@RequestParam("userName") String name,Model model) { 
	//	String name=request.getParameter("userName");
		String nameInCaps=name.toUpperCase();
		model.addAttribute("uName", nameInCaps);
		return   "welcome"; 
		}
}
