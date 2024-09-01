package com.jasdhir.springboot.profiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class NormalDay implements WeatherService{

	@Override
	public String forcast() {
		// TODO Auto-generated method stub
		return "Today is the Usual Normal Day";
	}

}
