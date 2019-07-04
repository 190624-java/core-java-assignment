package com.revature.core_java_assignment_jmacias;
/*	Instructions:
 * 	Write a program to store numbers from 1 to 100 in an array. Print out all
 *  the even numbers from the array. Use the enhanced FOR loop for printing 
 *  out the numbers.
 * */
public class Q12 {
	static int[] arr = new int[100];
	
	public static void getEvens() {
	for (int i = 0; i < arr.length; i++) {
		arr[i] = i+1;
	}
	// for each loop to print even numbers from array
		for (int x : arr) {
			if (x % 2 == 0) {
				System.out.print(x + " ");
			}
		}
	}
}
