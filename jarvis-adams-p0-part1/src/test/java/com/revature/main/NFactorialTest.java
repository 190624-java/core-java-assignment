package com.revature.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.revature.main.NFactorial;

public class NFactorialTest {
	
	NFactorial tester = new NFactorial();
	int root;
	double expectedFactorialResult; 



	@After
	public void tearDown() throws Exception {
		double result = tester.doFactorial(root);
		if(expectedFactorialResult != result)
			fail("Expected factorial: " + expectedFactorialResult+
					"\n was different from what was produced: " + result);
		assertTrue(true);
	}

	@Test
	public void testZero() {
		this.root = 0;
		this.expectedFactorialResult = 1;
	}
	
	@Test
	public void testLowNum() {
		this.root = 2;
		this.expectedFactorialResult = 2;
	}
	
	@Test
	/*
	 * Should throw the error code -1, because ambiguity in formula exists when doing 
	 * factorial of a negative number.
	 */
	public void testNegative() {
		this.root = -2;
		this.expectedFactorialResult = -1;
	}
	
	@Test
	/*
	 * Testing a root that produces a result outside the range of the int primitive type's 
	 * memory allocation
	 * Range of int is: -2,147,483,648 to 2,147,483,647
	 * 15! = 1,307,674,368,000‬
	 */
	public void testHighNum() {
		this.root = 15;
		this.expectedFactorialResult = 1_307_674_368_000d;
	}
	
	/*
	 * 
	 * Range of double is about ±1.79769313486231570E+308
	 * (15 significant decimal digits)
	 * according to cs-fundamentals.com retrieved 6/29/2019.
	 * http://cs-fundamentals.com/java-programming/java-primitive-data-types.php
	 */
//	@Test
//	public void testReallyHighNum() {
//		this.root = 83;
//		this.expectedFactorialResult = 7.1569457046263802294811533723187e+118‬;
//	}

}
