package com.jasdhir.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.jasdhir.springdemo")
@EnableAspectJAutoProxy
public class MyConfiguration {

}
