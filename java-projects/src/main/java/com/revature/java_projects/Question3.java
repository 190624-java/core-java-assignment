package com.revature.java_projects;

//try print instead of printLn to make it way easier to construct
public class Question3 
{
	public void readAnswer(String input)
	{
		
		for(int i = input.length(); i>0; i--) 
		{
			System.out.print(input.charAt(i-1));

		}
	}
}
