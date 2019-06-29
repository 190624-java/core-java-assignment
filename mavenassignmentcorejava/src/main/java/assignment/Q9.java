package assignment;

import java.util.ArrayList;

public class Q9 {

	private static  boolean isPrime = true;
	private static ArrayList<Integer> nums = new ArrayList<Integer>();
	
	 // stores values from 1-100
	private static void init() { 
		for(int i = 1; i < 101; i++) {
			nums.add(i);
		}
	}
	
	// find/print primes
	public static void printPrimes() { 
		init();
		for(int i = 1; i < nums.size(); i++) {
			int n = nums.get(i);
			for(int k = 2; k < n; k++) { // checks divisor from 2 to n - 1
				if(n % k == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) System.out.println(nums.get(i)); // since isPrime flag was set to true 2 will still be printed
			else isPrime = true; // reset 
		}
	}	
}
