package com.jasdhir.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String[] args) {
	//ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext();
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	
	Coach coach=context.getBean("baseBallCoach",Coach.class);
	
	System.out.println(coach.getDailyWorkOut());
	
	System.out.println(coach.getDailyFortune());
}
}
