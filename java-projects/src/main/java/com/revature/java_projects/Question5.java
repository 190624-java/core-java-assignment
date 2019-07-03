package com.revature.java_projects;

/*
 * Write a substring method that accepts a string str and an integer idx and returns the
substring contained between 0 and idx-1 inclusive. Do NOT use any of the existing substring
methods in the String, StringBuilder, or StringBuffer APIs.
 */

public class Question5 
{
	public static void readAnswer(String str, int idx) 
	{
		String pv = "";
		for(int i = 0; i<idx;i++) 
		{
			if(str.length()>i) 
			{
				pv += str.charAt(i);
			}
			else if(str.length()<=i) 
			{
				System.out.println("Jeeves: Your answer is: "+ pv);
			}
			
			
		}
	}
}
