package com.revature.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String[] args) {
	
	// 1. Create Container
	//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("myConfig.xml");
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfigurations.class);
	//2. Retrive the bean from the container
	Coach coach=context.getBean("trackCoach",Coach.class);
	
	//Coach b=new BaseBallCoach();
	// 3. Call the business method on the Object
	System.out.println(coach.getDailyWorkout());
	System.out.println(coach.getFortune());

	
	
	
	// 4. Close the context / container
	context.close();
	
	
}
}
