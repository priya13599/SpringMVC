package com.nucleus.aop;

import org.springframework.stereotype.Component;

@Component("std")
public class Student {

	public void displayStudent(String str, String str2)
	{
		System.out.println("Student..display method "+str+" "+str2);
	}
	public void displayStudent()
	{
		System.out.println("Student..display method without parameters");
		int a=10/0;
		System.out.println(a);
	}
}
