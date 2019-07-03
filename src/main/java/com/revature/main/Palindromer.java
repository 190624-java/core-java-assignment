package com.revature.main;

import java.util.ArrayList;


//Q8. Write a program that stores the following strings in an ArrayList and saves all the 
//palindromes in another ArrayList.
//“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, 
//“did”
public class Palindromer {

	ArrayList<String> list;
	ArrayList<String> pal;
	
	Palindromer(){
		list = new ArrayList<String>();
		pal = new ArrayList<String>();
		list.add("karan"); 
		list.add("madam");
		list.add("tom");
		list.add("civic");
		list.add("radar");
		list.add("jimmy");
		list.add("kayak");
		list.add("john");
		list.add("refer");
		list.add("billy");
		list.add("did");
	}
	
	private boolean isPalindrome(String g) {
		int m = findMiddle(g);
		int e = g.length();
		for(int i = 0; i<m; i++) {
			if(g.charAt(i)!=g.charAt(e-1)) return false;
			e--;
		}
		return true;
	}
	
	private int findMiddle(String g) {
		return g.length()/2;
	}
	
	private void populatePalindromesList() {
		for(int i=0;i<list.size(); i++) {
			if(isPalindrome(list.get(i))) pal.add(list.get(i));
		}
		
	}
}
