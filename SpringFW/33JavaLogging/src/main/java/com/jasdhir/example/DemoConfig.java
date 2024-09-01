package com.jasdhir.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.jasdhir.example")
@EnableAspectJAutoProxy
public class DemoConfig {

}
