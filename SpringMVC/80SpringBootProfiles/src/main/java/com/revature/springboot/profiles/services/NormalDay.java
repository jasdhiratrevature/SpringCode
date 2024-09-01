package com.revature.springboot.profiles.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class NormalDay implements WeatherService{

	@Override
	public String forcast() {
		// TODO Auto-generated method stub
		return "It's going to be a Normal Day";
	}

}
