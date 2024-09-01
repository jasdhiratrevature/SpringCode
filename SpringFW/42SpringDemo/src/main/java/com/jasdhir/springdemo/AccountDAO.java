package com.jasdhir.springdemo;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println("Added an Account ...");
	}
	public void addCard() {
		System.out.println("Added a Card ...");
	}
}
