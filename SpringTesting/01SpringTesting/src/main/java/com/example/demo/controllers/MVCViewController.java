package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCViewController {

	@RequestMapping("/home")
	public ModelAndView getView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("homePage");
		mv.addObject("message", "Hello There");
		return mv;
	}
		
}
