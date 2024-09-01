package com.jasdhir.springdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	private static final Logger logger = LogManager.getLogger(MainClass.class);
public static void main(String[] args) {
	
	//1. Create the Container
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	
	// 2. Reterieve the bean
	
	AccountDAO adao=context.getBean("accountDAO",AccountDAO.class);
	
	// 3. Call the methods of AccountDAO
	
	adao.addAccount();
	
	adao.addCard();
	
	// 4. Close context
	context.close();
}
}
