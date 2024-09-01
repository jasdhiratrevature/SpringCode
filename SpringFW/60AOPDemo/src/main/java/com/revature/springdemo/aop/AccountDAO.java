package com.revature.springdemo.aop;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void  addAccount() {
		System.out.println("This method addAccount is from the AccountDAO class");
	}
	
	public void addCreditCard() {
		System.out.println("This is Adding Credit Card");
	}
	
	public double getBalance() {
		return 100*Math.random();
	}
	public void someException() {
		throw new RuntimeException();
	}
	
	public void tryAroundAdvice() {
		System.out.println("Trying Around Advice");
	}
}
