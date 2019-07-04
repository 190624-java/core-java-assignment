package com.revature.main;

public class Fibi {

	//Fibonacci sequence is defined as taking the previous 2 numbers and summing them to 
	//get the result. The first previous number is nonexistant if starting the sequence.
	//In other words, the first 2 values are constant in the sequence.
	private int prev = 0;
	private int current = 1;

	public int getNext(int current) {
		int result = current + this.prev;
		this.prev = current;
		this.current = result;
		return result;
	}
	
	public void show25() {
		//prime the output as sequence is defined
		System.out.print("0, 1");
		//The first 25 numbers are desired, but the first 2 are complete 
		//25-3 = 22 iterations remaining
		for(int i=0; i<23; i++) {
			System.out.print(", "+this.getNext(this.current));
		}
	}
	
	
	//TODO
	public void show25_recursive() {
		
	}
	
	
}
