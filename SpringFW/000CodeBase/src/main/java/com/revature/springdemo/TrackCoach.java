package com.revature.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	HappyFortuneService myFortune;
 
public String getDailyWorkout() {
	 return "Run Sprint 100m";
 }

	/*
	 * public TrackCoach(HappyFortuneService myFortune) { super(); this.myFortune =
	 * myFortune; }
	 */

@Override
public String getFortune() {
	// TODO Auto-generated method stub
	return myFortune.getDailyFortune();
}

@Autowired
public void setMyFortune(HappyFortuneService myFortune) {
	this.myFortune = myFortune;
}

public void doSomeInitWork() {
	System.out.println("Initialize your variables and objects here ...like dbconn, files etc");
}
public void doSomeCleanUp() {
	System.out.println("Clean Up your variables and objects here ...like dbconn, files etc");
}
}
