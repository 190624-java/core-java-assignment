package com.revature.core_java_assignment_jmacias;
		// instructions:
		//Write a program having a concrete ;subclass that inherits 
		// three abstract methods from a superclass. Provide the following 
		// three implementations in the subclass corresponding to the abstract
		// methods in the superclass: 
		// 1. Check for uppercase characters in a string, and return ‘true’ or
		// ‘false’ depending if any are found. 
		// 2. Convert all of the lower case characters to uppercase in the
		// input string, and return the result.
		// 3. Convert the input string to integer and add 10, output the
		// result to the console. Create an appropriate class having a main
		// method to test the above setup.
public class Q18 extends Q18Super {

	@Override
	boolean checkUpper(String s) {
		//  Checking whether the string equals the string converted to lower
		//  case.  If it does, that means that there were no upper cases letters
		//  returning true if there were uppers.
		boolean hasUpper = s.equals(s.toLowerCase());
		return !hasUpper;
	}

	@Override
	String convertLower(String s) {
		return s.toLowerCase();
	}

	@Override
	void intAdd(String s) {
		int sInt = Integer.parseInt(s);
		System.out.print("Parameter + 10:    ");
		System.out.println(sInt + 10);
	}
	
}
