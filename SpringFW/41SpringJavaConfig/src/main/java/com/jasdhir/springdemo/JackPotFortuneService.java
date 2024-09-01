package com.jasdhir.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class JackPotFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "We hit a Jack Pot :)";
	}

}
