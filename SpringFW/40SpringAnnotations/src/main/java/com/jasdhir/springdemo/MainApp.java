package com.jasdhir.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Coach sCoach=context.getBean("swimmingCoach",Coach.class);
	
	System.out.println(sCoach.getDailyWorkOut());
	
}
}
