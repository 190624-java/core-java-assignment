package com.revature.main;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

//Q14. 
//Write a program that demonstrates the switch case. Implement the following 
//functionalities in the cases:java
//Case 1: Find the square root of a number using the Math class method.
//Case 2: Display today’s date.
//Case 3: Split the following string and store it in a string array.
//       	 “I am learning Core Java”
public class Cases {

	
	public void handleCase(int c) {
		switch(c) {
		case 1: { findSquareRoot(); break; }
		case 2: { printDate(); break; }
		case 3: { System.out.println("The split string variable is: " +
				this.splitToWords()); break; }
		default: System.out.println("Wrong Case #. Should be between 1 and 3 inclusive.");
		}
	}
	
	private double findSquareRoot() {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		double d = getSquareRoot(Double.valueOf(s.next()));
		System.out.println("The square root was: "+d);
		return d;
	}
	private double getSquareRoot(double n) {
		return Math.sqrt(n);
	}
	
	private void printDate() {
		System.out.println("Todays Date is: "+LocalDate.now().format(
				DateTimeFormatter.ofLocalizedDate(
						FormatStyle.MEDIUM)
				)); 
	}
	
	private String[] splitToWords() {
		String s = "I am learning Core Java";
		return s.split(" ");
	}
}
