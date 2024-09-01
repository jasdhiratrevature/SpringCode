package com.jasdhir.springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class IndexController {
   
	@RequestMapping("/mypage")
    public String index(Model m) {
        m.addAttribute("someAttribute", "Welcome to Spring MVC");
        return "index"; ///WEB-INF/views/index.jsp
    } 
}
