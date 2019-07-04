package com.revature.java_projects;

public class Question17 
{
	public static void readAnswer(double principal, double rate, double time) 
	{
		System.out.println("Jeeves: Your expected interest should be " + String.valueOf(principal*(rate/100)*time));
	}
}
