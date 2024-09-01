package com.revature.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String[] args) {
	
	// 1. Create the container
	//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	
	// 2. Retrieve the bean from context
		Coach coach=context.getBean("tennisCoach",Coach.class);
	
	// 3. Call the business methods of the Bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
	
		
	// 4. Close the context
		context.close();
		
}
}
