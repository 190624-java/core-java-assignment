package com.revature.java_projects;

import java.util.ArrayList;

public class Question19 
{
	public static void readAnswer() 
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbersTemp = new ArrayList<>();
		for(int i =1; i<11;i++) 
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		int temp = 0;
		int primeC = 0;
		for(int i: numbers) 
		{
			if(i/2 == (float)i/2) 
			{
				temp += i;
			}
			if(i==10) 
			{
				System.out.println(temp);
				temp = 0;
			}
		}
		for(int i: numbers) 
		{
			if(i/2 != (float)i/2) 
			{
				temp += i;
			}
			if(i==10) 
			{
				System.out.println(temp);
				temp = 0;
			}
		}
		for(Integer i:numbers) 
		{
			for(int k = 1; k<11;k++) 
			{
				if(i/k == (float)i/k) 
				{
					primeC++;
				}

			}
			if(primeC<3) 
			{
				numbersTemp.add(i);
			}
			primeC = 0;
		}
		for(Integer i: numbersTemp) 
		{
			numbers.remove(i);
		}
		System.out.println(numbers);
	}
}
