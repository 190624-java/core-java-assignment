package com.revature.core_java_assignment_jmacias;

import java.util.ArrayList;

// Instructions:
// Create an ArrayList and insert integers 1 through 10. Display the ArrayList.
// Add all the even numbers up and display the result. Add all the odd numbers
//up and display the result. Remove the prime numbers from the ArrayList and
// print out the remaining ArrayList.
public class Q19 {
	public static void addOddsRemovePrimes() {
		
		// new arraylist with values 1-10
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add(i + 1);
		}
		// getting sum of evens and printing it
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 2 == 0) {
				sum += arr.get(i);
			}
		}
		System.out.println("Sum of even numbers from the arrary: " + sum);
		
		
		// setting up primes array with indexes to be removed from arr
		int[] primes = {2, 3, 5, 7};
		for (int i = 0; i < primes.length; i++) {
			arr.remove(arr.indexOf(primes[i]));
		}
		
		
		System.out.print("[");
		for (int k : arr) {
			System.out.print(k + ", ");
		}
		System.out.println("]");
		
		
	}
}
