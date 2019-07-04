package com.revature.java_projects;

import java.util.Scanner;

public class Question18 extends AbstractSuperClass 
{

	public static void main(String[] args) 
	{

		Question18 question18 = new Question18();
		try(Scanner init = new Scanner(System.in))
		{
			String s = init.nextLine();
			question18.checkIfUppercase(s);
			s = question18.capitilizeInput(s);
			System.out.println(s);
			System.out.println(question18.digitizeString(s));
		}
	}
	
	@Override
	public void checkIfUppercase(String s) 
	{
		for(int i = 0; i < s.length();i++) 
		{
			if(Character.isUpperCase(s.charAt(i))) 
			{
				System.out.println("True");
				break;
			}
			i++;
		}
	}

	@Override
	public String capitilizeInput(String s) 
	{
		return s.toUpperCase();
	}

	@Override
	public int digitizeString(String s) 
	{
		return s.chars().sum()+10;
	}

}
