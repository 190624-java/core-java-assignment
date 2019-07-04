package com.revature.java_projects;

public class Question1 
{
	static void readanswer() 
	{
		int[] sortNum = {1,0,5,6,3,2,3,7,9,8,4};
		int initLen = sortNum.length;
		System.out.print("Jeeves: The numbers I have for you sir are: " );
		for(int z: sortNum) 
		{
			System.out.print(z + " ");
		}
		System.out.print("\n");

		for(int i = 0; i < initLen-1; i++) 
		{
			for(int k = 0; k < initLen-i-1; k++) 
			{
				if(sortNum[k] > sortNum[k+1]) 
				{
					int sort = sortNum[k];
					sortNum[k] = sortNum[k+1];
					sortNum[k+1] = sort;
				}
			}
		}
		System.out.print("Jeeves: After sorting them we have ");
		for(int z: sortNum) 
		{
			System.out.print(z + " ");
		}
		System.out.print("\n");
		

	}
}