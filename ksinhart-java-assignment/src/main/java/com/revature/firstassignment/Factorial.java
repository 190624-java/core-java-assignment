package com.revature.firstassignment;

public class Factorial {
	public static int factorial(int given){
		if(given>0) {
			int product=given;
			int temp=given;
			while (temp > 1) {
				product = product* (--temp);
			}

			return product;
		}
		else {
			System.out.print("Cannot be done for ");
			return given;
		}
		
	}
}
