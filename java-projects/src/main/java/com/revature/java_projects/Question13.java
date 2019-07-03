package com.revature.java_projects;

public class Question13 
{
	public static void readAnswer() 
	{
		int curNum = 0;
		
		for(int rev = 1; rev<5;rev++) 
		{
			int t = 0;
			while(rev>t) {
				switch (curNum)
				{
				case 0:
					System.out.print("0 ");
					curNum = 1;
					break;
				case 1:
					System.out.print("1 ");
					curNum = 0;
					break;
				}
				t++;
			}
			System.out.println();
			t=0;
		}
	}
}
