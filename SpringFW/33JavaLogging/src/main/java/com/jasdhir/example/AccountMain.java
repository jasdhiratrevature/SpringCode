package com.jasdhir.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountMain {
	//private static Logger logger=Logger.getLogger("MyLogger");
	private static final Logger logger = LogManager.getLogger(AccountMain.class);
public static void main(String[] args) {

	/*
	 * ****** JAVA WAY TO DO THINGS
	 * AccountDAO dao=new AccountDAO(); 
	 * logger.info("Entering add Account");
	 * dao.addAccount(); 
	 * logger.info("Adding Account Done ... ");
	 */
	
	
	/* SPRING AOP WAY */

		// step 1 .create a container
	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DemoConfig.class);
	
	// Step 2. Get a bean from context
	AccountDAO dao= context.getBean("accountDAO",AccountDAO.class);
	
	// step 3. use the object call the business method
	dao.addAccount();
	System.out.println("-------------------------------------");
	dao.addCard();
//	System.out.println("-----------------------------------");
	//System.out.println("Name is : "+dao.getCustomerName());
	//System.out.println("------------------------------");
	//dao.thisMethodThowsException();
	dao.testingAroundAdvice();
	
}
}
