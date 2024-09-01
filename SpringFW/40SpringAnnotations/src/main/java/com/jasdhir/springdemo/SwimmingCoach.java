package com.jasdhir.springdemo;

import org.springframework.stereotype.Component;


@Component
public class SwimmingCoach implements Coach{

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Swim 500 meters";
	}

}
