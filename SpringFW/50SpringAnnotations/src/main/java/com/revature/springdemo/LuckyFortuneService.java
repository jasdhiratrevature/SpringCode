package com.revature.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LuckyFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is our Lucky Day !!!";
	}

}
