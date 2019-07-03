package assignment;

import java.util.ArrayList;

public class Q9 {

	private static  boolean isPrime = true;
	//private static ArrayList<Integer> nums = new ArrayList<Integer>();
	private static int[] nums = new int[100];
	private static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	 // stores values from 1-100
	private static void init() { 
		for(int i = 1; i < 101; i++) {
			nums[i -1] = i;
		}
	}
	
	// find/print primes
	public static ArrayList<Integer> Primes() { 
		init();
		for(int i = 1; i < nums.length; i++) {
			int n = nums[i];
			for(int k = 2; k < n; k++) { // checks divisor from 2 to n - 1
				if(n % k == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) primes.add(nums[i]);
			else isPrime = true; // reset 
		}
		return primes;
	}	
}
