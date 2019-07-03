package com.revature.java_projects;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Question8 
{
	public static void readAnswer() 
	{
		ArrayList<String> words = new ArrayList<>(Arrays.asList("karan","madam","tom","civic","radar","jimmy","kayak","john","refer","billy","did"));
		ArrayList<String> palindrome = new ArrayList<>();
		System.out.println(words);
		for(String s: words) 
		{
			StringBuffer a = new StringBuffer(s);
			a = a.reverse();
			if(s.equals(a.toString())) 
			{
				palindrome.add(s);
			}
		}
		for(String s: palindrome) 
		{
			words.remove(s);
		}
		System.out.println(words);
		System.out.println(palindrome);
	}
}
