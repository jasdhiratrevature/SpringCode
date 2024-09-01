package com.jasdhir.springdemo.aop;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
	
	public double deposit(double amount) {
		return amount+1000;
	}
	
	public double withdraw(double amount) {
		if (amount<0)
			throw new RuntimeException();
		else
			return 1000;
	}
	
	public String  logMeIn() {
		System.out.println("Calling method");
		return "Account login";
	}
}
