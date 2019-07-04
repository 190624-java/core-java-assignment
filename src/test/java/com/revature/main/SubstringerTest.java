package com.revature.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.main.Substringer;

public class SubstringerTest {

	static Substringer ser;
	static String ts; //test string
	static String es; //expected string
	static int end; //end index of original string for the substring to get
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ser = new Substringer();
	}

	@After
	public void tearDown() throws Exception {
		assertTrue(ser.getSubstring(ts, end).equals(es));
	}

	@Test
	public void testSentence() {
		ts = "Hello my world";
		end = 7;
		es = "Hello m";		
	}
	
	@Test
	public void testSameLength() {
		ts = "Hello";
		end = 5;
		es = "Hello";		
	}
	
	@Test
	public void testGetWordFirstChar() {
		ts = "Hello";
		end = 1;
		es = "H";		
	}
	
	@Test
	public void testEmptyString() {
		ts = "";
		end = 1;
		es = "Error: Out of Bounds: End index too great";		
	}
	
	@Test
	public void testEnd_OutOfBounds_neg() {
		ts = "Hello";
		end = -3;
		es = "Error: Out of Bounds: End index is negative; it must be >= 0";		
	}
	
	@Test
	public void testEnd_OutOfBounds_posOver() {
		ts = "Hello";
		end = 8;
		es = "Error: Out of Bounds: End index too great";		
	}
	
	@Test
	/*
	 * There's no point in making a substring function accept end index 0, because
	 * the substring would by -1.
	 */
	public void testEnd_AtZero() {
		ts = "Bla";
		end = 0;
		es = "Error: must give end index > 0";		
	}
	
	@Test
	public void testEnd_AtOne() {
		ts = "Hello";
		end = 1;
		es = "H";		
	}


}
