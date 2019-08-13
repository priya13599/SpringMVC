package com.nucleus.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect2 {

	
	/*@After("execution(void displayStudent())")
	public void advice1()
	{		
	System.out.println("After advice is working...");	
	}*/
	
	@Around("execution(void displayStudent())")
	public void advice1(ProceedingJoinPoint pjp) 
	{		
	System.out.println("Around advice is working...start");
	
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	System.out.println("Around advice is working...end");
	}
}
