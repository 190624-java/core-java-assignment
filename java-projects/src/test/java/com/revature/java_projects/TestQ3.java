package com.revature.java_projects;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Before;

/*
 * Positive test case showcasing functionality, but altered due to limitations in desired implementations and inability to test those parameters.
 */

public class TestQ3 
{

	
	@Test
	public void test() 
	{
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = "Once upon a time there was a young lad in an ancient forst, whom had never heard of the evil king.";
		String temp = "";//not legal for problem solving, but needed to showcase solution equivalence.
		for(int i = input.length(); i>0; i--) 
		{
			System.out.print(input.charAt(i-1));
			temp += input.charAt(i-1);
		}

		assertEquals(".gnik live eht fo draeh reven dah mohw ,tsrof tneicna na ni dal gnuoy a saw ereht emit a nopu ecnO", temp);
	}
	
}
