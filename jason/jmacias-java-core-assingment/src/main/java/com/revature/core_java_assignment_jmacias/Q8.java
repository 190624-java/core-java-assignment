package com.revature.core_java_assignment_jmacias;

import java.util.ArrayList;
import java.util.Collections;

public class Q8 {
	
	public static ArrayList<String> returnPalidromes(String a, 
			String b, String c, String d, String e, String f,
			String g, String h, String i, String j, String k) {
		// Instructions:
		/* 
		 * Write a program that stores the passed strings in an 
		 * ArrayList and saves all the palindromes in another 
		 * ArrayList.
		 * */
		
		// setting up two new arrayLists and adding parameters to first
		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		Collections.addAll(arr, a, b, c, d, e, f, g, h, i, j, k);
		
		// looping through arr and checking for palindromes, adding
		// them to arr2 if so
		for (int l=0; l < arr.size(); l++) {
			String str = arr.get(l);
			for (int m = 0; m < (str.length() / 2); m++){
			    char ch = str.charAt(m);        
			    char mirror = str.charAt(str.length() - 1 - m);
			    if (ch != mirror) {
			    	break;
			    }
			    arr2.add(str);
			}
		}
		return arr2;
	}

}
