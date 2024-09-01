package com.revature.springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountMain {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AccountConfig.class);
	
	AccountDAO account=context.getBean("accountDAO",AccountDAO.class);
	
	account.addAccount();
	
	// add a credit card
	account.addCreditCard();
	
	System.out.println("Balance = "+account.getBalance());
	
	// For Exception
	//account.someException();
	
	account.tryAroundAdvice();
}
}
