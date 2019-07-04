package com.revature.main;

public class Substringer {
	String sub; 
	public String getSubstring(String sourceString, int end) {
		sub = "";
		
		//Error Checking and Return error message as value if error is found.
		if(end>sourceString.length()) {
			return "Error: Out of Bounds: End index too great";
		} 
		if(end<0) {
			return "Error: Out of Bounds: End index is negative; it must be >= 0";
		}
		if(end==0) {
			return "Error: must give end index > 0";
		}
		
		
		for(int i=0; i<end; i++) {
			sub += sourceString.charAt(i);
		}
		
		return sub;
		//return new String(sub);
	};
}
