package com.revature.main.access2;

import com.revature.main.access1.*;
//Q11. Write a program that would access two float-variables from a class that exists in 
//another package. Note, you will need to create two packages to demonstrate the solution.
public class Accessor {

	private Values v;
	
	public Accessor(){
		v = new Values();
	}
	
	public Values getValues() {
		return v;
	}
}
