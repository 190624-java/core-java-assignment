package com.revature.core_java_assignment_jmacias;

public class Q2 {
	// Instructions:
	// Write a program to display the first 25 Fibonacci numbers
	// beginning at zero.
	
	// setting up empty array
	private static int[] fibNums = new int[25];
	
	public static int[] getFibNums() {
		// filling in first two values of sequence
		fibNums[0] = 0;
		fibNums[1] = 1;
		// looping over remaining indexes to get sequence by adding
		// previous two numbers in sequence to get each index
		for (int i = 2; i < fibNums.length; i++) {
			fibNums[i] = fibNums[i-2] + fibNums[i-1];
		}
		return fibNums;
	};
	
}
