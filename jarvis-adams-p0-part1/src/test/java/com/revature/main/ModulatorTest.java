package com.revature.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.revature.main.Modulator;

public class ModulatorTest {

	Modulator m = new Modulator();
	private int a;
	boolean expected, actual;
	
	@After
	public void tearDown() throws Exception {
		assertSame("The modulus check failed", expected, m.isEven(a));
	}

	@Test
	public void testOdd() {
		a = 3;
		expected = false;
	}

	@Test
	public void testEven() {
		a = 24;
		expected = true;
	}
		
	@Test
	public void testZero() {
		a = 0;
		expected = true;
	}

	@Test
	public void testNegativeEven() {
		a = -6;
		expected = true;
	}
	
	@Test
	public void testNegativeOdd() {
		a = -7;
		expected = false;
	}

	@Test
	public void testFraction() {
		a = 2;
		expected = true; //assuming 0 is an even number //assuming 2/4 = 0.
	}

}
