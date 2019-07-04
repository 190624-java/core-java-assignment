package assignment;

import java.util.ArrayList;

public class Q12 {
	
	private static int a[] = new int[100];
	private static ArrayList<Integer> evens = new ArrayList<Integer>(); // used only for unit testing

	private static void storeValues() { // 1 to 100 stored	
		for(int i = 0; i < 100; i++) {
			a[i] = i + 1;
		}
	}
	
	//prints all evens in an array from 1 to 100
	public static ArrayList<Integer> printEvens() {
		storeValues();
		for(int x : a) {
			if(x % 2 == 0) {
				System.out.print(x + " ");
				if(x % 10 == 0) System.out.println(); // next line
				evens.add(x);
			}
		}
		return evens; 
	}
}
