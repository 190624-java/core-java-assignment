package com.revature.firstassignment;

import java.util.*;

public class Palindrome {
	public static void palindrome(String[] array) {
		ArrayList<String> nPal = new ArrayList<String>(array.length);//no palindrome
		ArrayList<String> yPal = new ArrayList<String>(array.length);//yes palindrome
		for(String str:array) {
			int i=str.length()-1;
			int pos=0;
			boolean check=true;//true if palindrome
			while(pos<str.length()) {
				if (str.charAt(pos)!=str.charAt(i)) {
					check=false;
				}
				pos++;
				i--;
			}
			if(check) {
				yPal.add(str);
			}
			else {
				nPal.add(str);
			}
		}
		//Print the arrays here
		System.out.println(yPal.toString());
}
}
