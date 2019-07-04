package com.revature.java_projects;

public class Question12 
{
	public static void readAnswer() 
	{
		int[] num = new int[100];
		for(int i = 0; i<num.length;i++) 
		{
			num[i] = i+1;
		}
		for(int i:num) 
		{
			if(i/2 == (float)i/2) 
			{
				System.out.println(i);
			}
		}
	}
}
