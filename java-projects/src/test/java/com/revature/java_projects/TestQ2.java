package com.revature.java_projects;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/*
 * Testing Fibonacci number generation by proving
 * initialization logic and that can persist as a algorithm.
 */

public class TestQ2 
{
	@Test
	public void test() 
	{
		int[] numbers = new int[10];
		numbers[0] = 0;
		numbers[1] =1;
		for(int a = 2; a<numbers.length; a++) 
		{
			numbers[a] = numbers[a-2] + numbers[a-1];
		}
		System.out.println(Arrays.toString(numbers));
		assertEquals(numbers[0], 0);
		assertEquals(numbers[1], 1);
		assertEquals(numbers[2], 1);
		assertEquals(numbers[3], 2);
		assertEquals(numbers[4], 3);
		assertEquals(numbers[5], 5);
		assertEquals(numbers[6], 8);
		assertEquals(numbers[7], 13);
		assertEquals(numbers[8], 21);
		assertEquals(numbers[9], 34);
	}
	
}
