package com.revature.java_projects;

/*
 * Write a program to compute N factorial.
 */

public class Question4 
{
	static public void readAnswer(int fact) 
	{
		long finalAnswer=1;
		for(int i = 1; i < fact+1 ; i++) 
		{
			finalAnswer = finalAnswer*(i);
		}
		
		System.out.println("Jeeves: The factorial calculation of your query is " + finalAnswer);
	}
}
