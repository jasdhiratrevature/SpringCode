package com.jasdhir.springdemo.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
	final Logger logger = Logger.getLogger("my logger");
	
	@Before("execution(public void add*())")
	public void addAccountLogger() {
		logger.info("Adding an Account");
	}
	
	@After("execution(public void add*())")
	public void addedAccountLogger() {
		logger.info("Adding an Account");
	}
	
	@AfterReturning(pointcut="execution(public double deposit(..))",returning = "result")
	public void doubleBalance(double result) {
		logger.info("The result = "+result*2);
	}
	
	@AfterThrowing(
			pointcut="execution(* withdraw(..))",
			throwing="theExc")
	public void afterThrowingAdvice(Throwable theExc) {
		logger.info("Exception "+theExc);
	}
	
	
	  @Around("execution(public String logMeIn())") public void
	  aroundAdvice(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
	  logger.info("Doing aroundAdvice"); 
	  theProceedingJoinPoint.proceed();
	  logger.info("Done With Around Advice");
	  
	  }
	 
	}

