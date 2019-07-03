package com.revature.firstassignment;

import java.util.ArrayList;

public class PrintEven {
	public static void printEven() {
		ArrayList<Integer> numList = new ArrayList<Integer>(100);
		int i=1;
		while(i<101) {
			numList.add(i);
			i++;
		}//array now has 1 to 100
		
		for(int n : numList) {
			if(isEven(n)) {
				System.out.print(n+",");
			}
		}
		System.out.println();
	}
	
	private static boolean isEven(int n) {
		return n%2==0;
	}
}