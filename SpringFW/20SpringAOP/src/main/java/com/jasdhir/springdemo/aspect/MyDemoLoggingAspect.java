package com.jasdhir.springdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

		@Pointcut("execution(public void add*(..))")
		private void myPointCut() {}
		
		@Pointcut("execution(public void sub*(..))")
		private void myPointCut2() {}
		
	@Before("myPointCut() ! myPointCut2()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		//proceed();
		
	}
	
	@After("myPointCut()")
	public void afterAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		//proceed();
		
	}
}










