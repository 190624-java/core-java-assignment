package com.revature.java_projects;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Question14 
{
	public static void readAnswer(int choice) 
	{
		switch(choice) 
		{
		case 1:
			Scanner rl = new Scanner(System.in);
			System.out.println("Jeeves: Please tell me a number so I can find its square root for you.");
			double sqrt = Math.sqrt(rl.nextInt());
			System.out.println();
			System.out.println("Jeeves: The square root of your query is " + sqrt + ".");
			rl.close();
			break;
		case 2:
			Calendar cal = Calendar.getInstance();
			System.out.println("Jeeves: Today's dat is " + Integer.toString(Calendar.MONTH) + 
					Integer.toString(Calendar.DAY_OF_MONTH)  + Integer.toString(Calendar.YEAR));
			break;
		case 3:
			String degrade = "I am learning Core Java";
			System.out.println(degrade);
			ArrayList<String> cjs = new ArrayList<>();
			Scanner read = new Scanner(degrade);
			while(read.hasNext()) 
			{
				cjs.add(read.next());
			}
			for(String s:cjs) 
			{
				System.out.println(s);
			}
			read.close();
		}
	}
}
