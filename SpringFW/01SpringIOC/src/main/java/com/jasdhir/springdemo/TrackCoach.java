package com.jasdhir.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5km";
	}
public TrackCoach() {
	System.out.println("Default Constructor Track Coach");
}
}










