package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q8Palindrome;

public class Q8Test {

	
	Q8Palindrome q = new Q8Palindrome(); //Added in a string of integers to test if it worked (should because StringBuilder
										 //Worked as intended
	
	@Test
	public void palindromeTest() {
		
		q.isPalindrome();
		
	}
	
}
