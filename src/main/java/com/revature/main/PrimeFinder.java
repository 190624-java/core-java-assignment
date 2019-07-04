package com.revature.main;

import java.util.ArrayList;

//Q9. Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime 
//numbers to the console.
public class PrimeFinder {

	private ArrayList<Integer> nums;
	
	public PrimeFinder(){
		populateList0To100();
	}
	
//--------------------------------
//	Static Methods
//--------------------------------
	
	public static boolean isPrime(Integer x) {
		if(floatDivBy2(x)==0.0) return false;
		if(floatDivBy3(x)==0.0) return false;
		return true;
	}
	
	public static boolean isEven(Integer x) {
		if(x.intValue()==0 || floatDivBy2(x)==0.0) return true;
		return false;
	}
	
	public static boolean isOdd(Integer x) {
		if(x.intValue()==1 || floatDivBy3(x)==0.0) return true;
		return false;
	}
	
	public static float floatDivBy2(Integer x) {
		return x.floatValue()%2;
	}
	
	public static float floatDivBy3(Integer x) {
		return x.floatValue()/3;
	}
	
	
//--------------------------------
//	Methods
//--------------------------------	
	
	public void printPrimes() {
		System.out.println("1,2,3"); //given and given by algorithmic formulas (div by 2 and div by 3)
		for(int i=4; i<101; i++) {
			if(isPrime(new Integer(nums.get(i)))) printAPrime(i);
		}
	}

	private void populateList0To100() {
		this.nums = new ArrayList<Integer>();
		for(int i=1; i<101; i++) {
			this.nums.add(i);
		}
	}
	
	private void printAPrime(int x) {
		System.out.print(", "+x);
	}
	

}
