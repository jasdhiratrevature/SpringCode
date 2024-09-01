package com.jasdhir.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jasdhir.springdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		theAccountDAO.addAccount(5);

		// do it again!
		System.out.println("\nlet's call it again!\n");
		
		// call the business method again
		theAccountDAO.addAccount(5);
				
		// close the context
		context.close();
	}

}










