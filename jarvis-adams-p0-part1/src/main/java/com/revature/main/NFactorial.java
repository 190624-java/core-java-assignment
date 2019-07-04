package com.revature.main;

//Q4

public class NFactorial {

	/*
	 * Takes an int value, since it is expected that input would be within that range.
	 * Returns a double, just in case the resulting number is too large for int primitive type.
	 * Uses the largest numerical value possible, because n! can quickly general large numbers.
	 */
	public double doFactorial(int root){
		if(root<0) return -1; //error, this doesn't accept negative numbers.
		if(root<2) return 1; //if root = 0 or 1 then 0!=1 and 1! = 1, so just exit with the result.
		else return root * this.doFactorial(root-1); 
	}
}
