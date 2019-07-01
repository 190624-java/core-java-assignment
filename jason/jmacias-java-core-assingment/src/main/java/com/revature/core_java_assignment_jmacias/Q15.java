package com.revature.core_java_assignment_jmacias;
//	Instructions: 
// Write a program that defines an interface having the
// following methods: addition, subtraction, multiplication, and 
// division. Create a class that implements this interface and 
// provides appropriate functionality to carry out the required 
// operations. Hard code two operands in a test class having a main
// method that calls the implementing class.

// implementing interface and providing required methods
public class Q15 implements Q15Interface {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int multipy(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		return a / b;
	}

}
