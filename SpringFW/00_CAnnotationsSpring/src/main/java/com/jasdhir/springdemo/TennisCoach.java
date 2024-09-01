package com.jasdhir.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	//@Autowired
	FortuneService lfs;
	
	
	
	public TennisCoach(FortuneService lfs) {
		this.lfs = lfs;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice Service";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return lfs.getDailyFortune();
	}

}
