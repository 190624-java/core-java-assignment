package com.revature.firstassignment;

public class ReverseString {
	protected static String reverseString(String tbr) {//to be reversed
		
		int length=tbr.length();
		//int oglength=length;
		//tbr.concat(tbr);
		for (int x=length-1;x>=0;x--) {
			//System.out.println(tbr.substring(x, x+1));
			tbr=tbr.concat(tbr.substring(x, x+1));
			//System.out.println(tbr);
		}
		tbr=tbr.substring(length);
		return tbr;
	}
}
