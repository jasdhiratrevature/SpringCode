package com.jasdhir.example;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println("Adding Account");
	}
	
	
	public void addCard() {
		System.out.println("Adding Card");
	}

	public String getCustomerName() {
		return "Jasdhir";
	}
	
	public void thisMethodThowsException() {
		System.out.println("Beware exception is on the way . . . . . . . ");
		throw new RuntimeException();
	}
	
	public void  testingAroundAdvice() {
		System.out.println("This is inside Around Advice");
	}
}
