package com.revature.core_java_assignment_jmacias;
//	Instructions:
// Write a program that demonstrates the switch case. Implement
// the following functionalities in
// the cases:java
// Case 1: Find the square root of a number using the Math class method.
// Case 2: Display today’s date.
// Case 3: Split the following string and store it in a string array.
// “I am learning Core Java”

import java.util.Date;

public class Q14 {
	// function to take in a string command and an int value as parameters
	public static void switchExample(String command, int value) {
		// switch statement to run different code depending on command
		switch (command) {
		case "sqrt": 
			double valueDbl = (double)value;
			double valueRoot =  Math.sqrt(valueDbl);
			System.out.println("Square root of " + value + ": " + valueRoot);
			break;
		case "date": 
			Date now = new Date();
			System.out.println("Today's date: " + now); 
			break;
		case "split":
			String str = "I am learning Core Java";
			String[] strArr = str.split(" ");
			System.out.print("Array: [");
			for (String x : strArr) {
				System.out.print(x + ", ");
			}
			System.out.println("]");
			break;
		default:
			System.out.println("Please use a valid command.");
		}
		System.out.println("");
	}
}
