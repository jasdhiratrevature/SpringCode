package com.jasdhir.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jasdhir.springdemo")
public class MyConfiguration {

/*	@Bean
	public FortuneService luckyFortuneService() {
		return new LuckyFortuneService();
	}
	
	@Bean 
	public Coach myTennisCoach() { 
		TennisCoach myTennisCoach = new  TennisCoach(luckyFortuneService());
		return myTennisCoach;
}*/
}