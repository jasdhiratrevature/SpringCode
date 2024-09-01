package com.jasdhir.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyApp {
	
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext();
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		
		Coach coach=context.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getFortune());
	}

}
