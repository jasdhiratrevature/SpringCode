package com.revature.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "It's a Happy Day !!!";
	}

}
