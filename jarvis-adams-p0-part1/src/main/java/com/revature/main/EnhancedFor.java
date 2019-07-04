package com.revature.main;

import java.util.ArrayList;

//Q12. Write a program to store numbers from 1 to 100 in an array. Print out all the even 
//numbers from the array. Use the enhanced FOR loop for printing out the numbers.
public class EnhancedFor {

	ArrayList<Integer> list;
	
	EnhancedFor(){
		list = new ArrayList<Integer>();
		
		for(int i =0; i<101; i++) {
			list.add(new Integer(i));
		}
	}	
	
	public void printEvens() {
		System.out.print("0");
		for(Integer i : list) {
			if(isEven(i)) System.out.println(", "+i.intValue());
		}
	}
	
	private boolean isEven(Integer x) {
		return PrimeFinder.isEven(x);
	}
	
}
