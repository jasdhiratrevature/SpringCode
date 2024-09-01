package com.jasdhir.boot.profiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class NormalDay implements WeatherService {

    @Override
    public String forecast() {
        return "Today is Normal day!";
    }

}
