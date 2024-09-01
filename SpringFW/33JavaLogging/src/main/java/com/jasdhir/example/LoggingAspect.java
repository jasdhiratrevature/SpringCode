package com.jasdhir.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	//private Logger logger=Logger.getLogger("AOP Logger");
	private static final Logger logger = LogManager.getLogger(LoggingAspect.class);

	@Pointcut("execution(public void add*())")
	public void myPC() {}
	
	@Before("myPC()")
	public void beforeAddAccount() {
		logger.info("Before Adding");
	}

	@After("myPC()")
	public void afterAddAccount() {
		logger.info("After Adding ");
	}
	
	@AfterReturning(pointcut = "execution(public String getCustomerName() )",returning = "result")
	public void afterReturnigMethod(String result) {
		logger.info("Name is :"+result.toUpperCase());
	}
	
	@AfterThrowing(pointcut = "execution (public void thisMethodThowsException())",throwing = "theExc")
	public void handlingException(Exception theExc) {
		logger.info("Exception is "+theExc.getMessage());
	}
	
	@Around("execution (public void testingAroundAdvice())")
	public void aroundAdviceCheck(ProceedingJoinPoint pjp ) throws Throwable {
		logger.info("Inside Around . . . ");
		pjp.proceed();
		logger.info("Done Calling method");
	}
}
