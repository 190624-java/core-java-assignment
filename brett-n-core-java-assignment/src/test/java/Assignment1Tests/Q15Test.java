package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q15TestClass;

public class Q15Test {

	Q15TestClass q = new Q15TestClass();
	
	
	@Test
	public void negativeValues() { //Works as intended with input negatives
		
		q.addition(-4, -2);
		q.subtraction(-9, 5);
		q.multiplication(-2, -2);
		q.division(-10,-2);
		
	}
	
}
