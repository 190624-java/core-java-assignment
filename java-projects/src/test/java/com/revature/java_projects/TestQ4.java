package com.revature.java_projects;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Positive test to prove different parameter values.
 */

public class TestQ4 
{
	@Test
	public void test() 
	{
		int fact = 10;
		long finalAnswer=1;
		for(int i = 1; i < fact+1 ; i++) 
		{
			finalAnswer = finalAnswer*(i);
		}
		
		System.out.println("Jeeves: The factorial calculation of your query is " + finalAnswer);
		assertEquals(3628800,finalAnswer);
	}
	
	@Test
	public void test1() 
	{
		int fact = 9;
		long finalAnswer=1;
		for(int i = 1; i < fact+1 ; i++) 
		{
			finalAnswer = finalAnswer*(i);
		}
		
		System.out.println("Jeeves: The factorial calculation of your query is " + finalAnswer);
		assertEquals(362880,finalAnswer);
	}
	@Test
	public void test2() 
	{
		int fact = 5;
		long finalAnswer=1;
		for(int i = 1; i < fact+1 ; i++) 
		{
			finalAnswer = finalAnswer*(i);
		}
		
		System.out.println("Jeeves: The factorial calculation of your query is " + finalAnswer);
		assertEquals(120,finalAnswer);
	}
	
}
