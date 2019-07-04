package com.revature.java_projects;

import java.util.Arrays;

public class Question2
{
	public static void readAnswer() 
	{
		int[] numbers = new int[25];
		numbers[0] = 0;
		numbers[1] =1;
		for(int a = 2; a<numbers.length; a++) 
		{
			numbers[a] = numbers[a-2] + numbers[a-1];
		}
		System.out.println(Arrays.toString(numbers));
	}
}
