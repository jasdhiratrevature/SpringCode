package com.jasdhir.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LuckyFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is a Lucky Day !!!";
	}

}
