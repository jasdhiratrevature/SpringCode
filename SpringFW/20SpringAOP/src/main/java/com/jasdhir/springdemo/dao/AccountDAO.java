package com.jasdhir.springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount(int x) {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
	
	
	public void addCredit(String y,String z) {
		System.out.println(getClass() + ": DOING MY DB WORK: CREDIT AN ACCOUNT");
	}
}

