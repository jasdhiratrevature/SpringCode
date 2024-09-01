package com.jasdhir.springdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class MyLogging {
	private static final Logger logger = LogManager.getLogger(MyLogging.class);
	
	@Pointcut("execution(public void addAccount())")
	private void myPC() {}
	
	@Before("myPC())")
	public void doSomethingBefore() {
		logger.info("Doing Something Before ....");
	}
	
	@After("myPC())")
	public void doSomethingAfter() {
		logger.info("Doing Something After ....");
	}
}
