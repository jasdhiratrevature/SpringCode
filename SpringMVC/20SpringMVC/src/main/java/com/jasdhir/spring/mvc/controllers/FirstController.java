package com.jasdhir.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {
	
	@RequestMapping("/my")
	public String getMyPage() {
		return "myPage"; // /WEB-INF/myviews/myPage.jsp
	}

	@RequestMapping("/p2")
	public String getPage2() {
		return "page2"; // /WEB-INF/myviews/page2.jsp
	}
}
