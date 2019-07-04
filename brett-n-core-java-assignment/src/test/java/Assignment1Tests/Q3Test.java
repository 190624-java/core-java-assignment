package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q3ReverseString;

public class Q3Test {

	Q3ReverseString tester = new Q3ReverseString();
	
	@Test
	public void reverseStringPassingInts() { //ReverseString takes a String, changes to char array
											 //Integers should also reverse
		
		tester.reverseString(); //Pass in 5500
								//Receive output of 0055
	}
	
}