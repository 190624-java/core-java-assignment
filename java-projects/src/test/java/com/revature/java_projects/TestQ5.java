package com.revature.java_projects;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Presents a positive test case and a test case which would result in an error if not handled correctly.
 * User input allows for ints of any size, however there is limited logic to clamp that integer to being smaller than the string.
 * If statement is in place to catch oversized integers and ensure there are no errors.
 */

public class TestQ5 
{
	@Test
	public void test() 
	{
		int idx = 22;
		String str = "Frankly dear, I don't";
		String pv = "";
		for(int i = 0; i<idx;i++) 
		{
			if(str.length()>i) 
			{
				pv += str.charAt(i);
			}
			else if(str.length()<=i) 
			{
				System.out.println("Jeeves: Your answer is: "+ pv);
			}			
		}
		assertEquals("Frankly dear, I don't", pv);

	}
	
}
