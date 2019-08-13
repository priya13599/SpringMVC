package com.nucleus.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	//* - one and only one parameter of any data type.
	//@Before("execution(void displayStudent(*))")
	
	//.. - Zero or more parameters of any data type.
	//@Before("execution(void displayStudent(..))")
	
	//for all the methods
	//@Before("execution(* *(..))")
	@Before("execution(void *..Employee.display*(..))")	
	public void advice1(JoinPoint joinPoint)
	{
		System.out.println("Method Name: "+joinPoint.getSignature().getName());
	System.out.println("Method is working...");	
	}
	
}
