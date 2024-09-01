package com.revature.springdemo.aop;

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

	@Pointcut("execution(public void add*())")
	private void myPC() {}
	
	@Before("myPC()")
	public void doSomeAction() {
		System.out.println("Trying to Add an Account");
	}
	
	@After("myPC()")
	public void doSomeOtherAction() {
		System.out.println("Account Added");
	}
	
	@AfterReturning(pointcut = "execution(public double getBalance())",returning = "someVal")
	public void doubleBalance(double someVal) {
		System.out.println("Balance Doubled ::" +someVal*10);
	}
	
	@AfterThrowing(pointcut = "execution(public void someException())",throwing = "ex")
	public void afterThrowingAdvice(Exception ex) {
		System.out.println(ex.getMessage());
	}
	
	@Around("execution(public void tryAroundAdvice())")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Before Around Advice");
		//pjp.proceed();
		System.out.println("After Around Advice");
	}
}
