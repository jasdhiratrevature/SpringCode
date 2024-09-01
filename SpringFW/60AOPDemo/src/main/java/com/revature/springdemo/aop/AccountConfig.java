package com.revature.springdemo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.revature.springdemo.aop"})
@EnableAspectJAutoProxy
public class AccountConfig {

}
