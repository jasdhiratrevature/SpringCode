package com.jasdhir.springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;





public class MainApp {
public static void main(String[] args) {
	// read spring config java class
			AnnotationConfigApplicationContext context =
					new AnnotationConfigApplicationContext(Config.class);
			
			// get the bean from spring container
			AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
			
			// call the business method
			theAccountDAO.addAccount();
			
			System.out.println(theAccountDAO.deposit(200));
			
			//System.out.println(theAccountDAO.withdraw(-100));
			
			
			System.out.println(theAccountDAO.logMeIn());
	
}
}
