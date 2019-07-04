package com.revature.main;

//Q6. Write a program to determine if an integer is even without using the modulus 
//operator (%)
public class Modulator {

	public boolean isEven(int a){
		//Divide a by 2 
		int q = a/2;
		//Multiply result by 2
		//Compare the results
		if(a==q*2) { 
			return true;
		}
		else return false;
	}
	
	public void printIsEven(int a){
		if(isEven(a)) System.out.println("The value '"+a+"' is even");
		else System.out.println("The value '"+a+"' is odd");
	}
	
	
}
