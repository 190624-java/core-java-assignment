package com.revature.core_java_assignment_jmacias;
// Instructions:
// write a function to determine whether an integer is even without
// using the modulus operator

public class Q6 {

	public static String isEven(int num) {
		int halfNum = num / 2;
		if (num * 2 == halfNum * 4) {
			return "This int is even";
		}
		else {
			return "This int is not even";
		}
	}
}
