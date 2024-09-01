package com.jasdhir.springboot.profiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("rain")
public class RainyDay implements WeatherService{

	@Override
	public String forcast() {
		// TODO Auto-generated method stub
		return "Wow IT's Raining !!! ";
	}

}
