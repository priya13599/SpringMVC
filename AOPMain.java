package com.nucleus.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nucleus.autowiring.Employee;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("aop-spring.xml");
		Student std=(Student)context.getBean("std");
		
		std.displayStudent();
		//std.displayStudent("abc","xyz");
		
		
		/*Employee emp=(Employee)context.getBean("emp");
		emp.display();
		emp.displayStudent();*/
	}

}
