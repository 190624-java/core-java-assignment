package com.revature.core_java_assignment_jmacias;

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
		System.out.println("Parameter + 10: ");
		System.out.println(sInt + 10);
	}
	
}
