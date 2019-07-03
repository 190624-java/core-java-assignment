package assignment;

import java.util.ArrayList;

public class Q19 {

	private static ArrayList<Integer> nums = new ArrayList<>();
	private static boolean isPrime = true;
	
	// store 1-10
	private static void init() {
		for(int i = 0; i < 10; i++) {
			nums.add(i + 1);
		}
	}
	
	public static void caller() {
		init();
		addEvens();
		addOdds();
		removePrimes(); // take out all primes
		printArrayList(nums); // arraylist with no primes
	}
	
	private static void addEvens() {
		int sum = 0;
		for(int x : nums) {
			if(x % 2 == 0) sum += x;
		}
		System.out.println("Sum of Evens: " + sum);
	}
	
	private static void addOdds() {
		int sum = 0;
		for(int x : nums) {
			if(x % 2 != 0) sum += x;
		}
		System.out.println("Sume of Odds: " + sum);
	}
	
	private static void removePrimes() {
		for(int i = 1; i < nums.size(); i++) {
			int n = nums.get(i);
			for(int k = 2; k < n; k++) { // checks divisor from 2 to n - 1
				if(n % k == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) nums.remove(i);
			else isPrime = true; // reset 
		}
	}
	
	private static void printArrayList(ArrayList<Integer> intList) {
			System.out.print("{ ");
			for(Integer i : intList) {
				System.out.print(i + " ");
			}
			System.out.println("}");
	}
	
	public static ArrayList<Integer> testNums() {		
		init();
		addEvens();
		addOdds();
		removePrimes(); // take out all primes
		return nums; 
	}
}
