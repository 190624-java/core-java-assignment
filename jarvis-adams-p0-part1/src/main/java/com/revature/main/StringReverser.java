package com.revature.main;

//Q4

public class StringReverser {

	//Get the string
	//Get the length of the string divided by 2 to get the halfway point
	//Manage a variable inside the for loop to index counting from back of string toward middle
	// One loop counts up to halfway
	// The other loop counts down to halfway
	// The values are swapped along the way in-place
	// - no need for 2 extra strings
	// - no need for extra memory expansion operations
	public String reverse(String s) {
		char[] ca = s.toCharArray();
		int mid = s.length()/2;
		int back = s.length()-1;
		
		for (int i=0; i<mid && back>0; i++) {
			ca = swap(ca,i,back);
			back--;
		}
		return new String(ca);
	}
	
	private char[] swap(char[] ca, int frontCursor, int backCursor) {
		char temp;
		temp = ca[frontCursor];
		ca[frontCursor]=ca[backCursor];
		ca[backCursor]=temp;
		return ca;
	}
}
