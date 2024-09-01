package com.jasdhir.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// define a default constructor
	/*public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
*/


	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/







	@Autowired
	public void anyMethodInjection(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside anyMethodInjection() method");
		this.fortuneService = theFortuneService;
	}




















@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}





















	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
