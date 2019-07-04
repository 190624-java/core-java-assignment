package com.revature.java_projects;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Positive test, takes no parameters in main method,
 * so best test is proof of theory even with different values.
 */

public class TestQ1 
{
	@Test
	public void test() 
	{
		int[] sortNum = {1,9,8,1,3,4,1,5,2,1};
		int[] sortedNum = {1,1,1,1,2,3,4,5,8,9};
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
		for(int i = 0; i<sortNum.length;i++) 
		{
			assertEquals(sortedNum[i], sortNum[i]);
		}
	}
	
}
