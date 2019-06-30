package com.revature.core_java_assignment_jmacias;

public class Q5 {
	// Instructions:
	// Write a substring method that accepts a string str and an 
	// integer idx and returns the substring contained between 
	// 0 and idx-1 inclusive.  Do NOT use any of the existing 
	// substring methods in the String, StringBuilder, or 
	// StringBuffer APIs.
	
	public static String subString(String str, int idx) {
		// starting empty array with length = idx for characters
		char[] strArr = new char[idx];
		for (int i = 0; i < idx; i++) {
			strArr[i] = str.charAt(i);
		}
		
		return String.copyValueOf(strArr);
	}
}
