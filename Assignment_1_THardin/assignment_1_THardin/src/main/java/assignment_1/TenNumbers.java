package assignment_1;

import java.util.ArrayList;

public class TenNumbers {
	
	public static void listManipulation () {
		ArrayList<Integer> tenNums = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			tenNums.add(i);
		}
		
		for(int i : tenNums) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int even = 0;
		int odd = 0;
		
		for(int i : tenNums) {
			if(i%2 == 0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		
		System.out.println("The total of all evens are: " + even);
		System.out.println("The total of all odds are: " + odd);
		
		tenNums.remove(1);
		tenNums.remove(1);
		tenNums.remove(2);
		tenNums.remove(3);
		
		System.out.println("The following is the array after removing primes");

		for(int i : tenNums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
