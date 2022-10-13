package com.springaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("MyAspect")
public class MyAspect {
	
	@Before("execution(* com.springaop.services.PaymentServiceImpl.makePayment(..))")	//if you have any argument then only you can use .. inside method
	public void printBefore()
	{
		System.out.println("payment started...");
	}
	
	@After("execution(* com.springaop.services.PaymentServiceImpl.makePayment(..))")
	public void printAfter()
	{
		System.out.println("payment completed...");
	}
	
	
}
