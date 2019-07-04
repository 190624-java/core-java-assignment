package com.revature.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.revature.main.Bubbler;

public class BubblerTest {

	Bubbler bubbler = new Bubbler();
	int[] expectedArray;
    int[] defaultA = {1,0,5,6,3,2,3,7,9,8,4};
	
	
	@After
	public void tearDown() throws Exception{
		assertArrayEquals("Both arrays are equal", expectedArray, bubbler.bubbleSort(defaultA));
	}
	
	@Test
	public void testBubbleSort() {
		expectedArray = new int[] {0,1,2,3,3,4,5,6,7,8,9};		
	}

}
