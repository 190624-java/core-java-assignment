package com.revature.main;

import com.revature.main.StringReverser;
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;


public class StringReverserTest {

	public static StringReverser sr;
	public String given;
	public String expected;
	
	@BeforeClass //before any other tests
	public static void setUpBeforeClass() throws Exception {
		sr = new StringReverser();
	}


	@After //after each test
	public void tearDown() throws Exception {
		assertEquals("String Reversed Correctly", expected, sr.reverse(given)); 
		//assertTrue(sr.reverse(given).equals(expected));
	}

	
	@Test
	public void test0Letters() {		
		given = "";
		expected = "";
	}
	
	@Test
	public void test1Letter() {		
		given = "a";
		expected = "a";
	}
	
	@Test
	public void test2Letters() {		
		given = "ab";
		expected = "ba";
	}
	
	@Test
	public void testGT2Letters() {		
		given = "happy";
		expected = "yppah";
	}

}
