package com.revature.sp.ms.controllers;

import com.revature.sp.ms.bean.Limits;
import com.revature.sp.ms.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration configuration;
@GetMapping("/limits")
    public Limits retrieveLimits(){
    return  new Limits(configuration.getMinimum(),configuration.getMaximum());
       // return new Limits(1,1000);
    }
}
