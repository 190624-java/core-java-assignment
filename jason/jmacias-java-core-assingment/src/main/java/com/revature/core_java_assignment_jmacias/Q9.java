package com.revature.core_java_assignment_jmacias;

import java.util.ArrayList;

public class Q9 {
	// Instructions: 
	// Create an ArrayList which stores numbers from 1-100 and prints out
	// all the prime numbers to the console.
	
	public static ArrayList<Integer> printPrimes() {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		for (int i = 1; i < 101; i++) {
			arr1.add(i);
		}
		
		for (int num : arr1) {
			if (num == 1 || num % 2 == 0 && num !=2) {
				continue;
			}
			arr2.add(num);
		}
		
		for (int i = 0; i < arr2.size(); i++) {
			
			for (int j = i ; j < arr2.size(); j++) {
				if (arr2.get(j) == arr2.get(i) ) {
					continue;
				}
				else if (arr2.get(j) % arr2.get(i) == 0) {
					arr2.remove(j);
				}
			}
		}
		
		return arr2;
	}

}
