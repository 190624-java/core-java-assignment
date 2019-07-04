package com.revature.core_java_assignment_jmacias;

public class Q3 {
	// Instructions:
	// Reverse a string without using a temporary variable.  DO NOT
	// use the reverse() method in the StringBuffer or the
	// StringBuilder APIs
	
	public static String reverseString(String str) {
		String[] charArr = str.split("");
		String[] charArr2 = new String[charArr.length];
		for (int i = 0; i < charArr.length; i++) {
			charArr2[charArr2.length - i - 1] = charArr[i];
		}
		String str2 = String.join("", charArr2);
		return str2;
	}

}
