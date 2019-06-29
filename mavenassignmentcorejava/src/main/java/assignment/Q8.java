package assignment;

import java.util.ArrayList;

/*
 * purpose of this class it to store palindromes and non-palindromes in 
 * separate ArrayLists
 */
public class Q8 {
	
	private static ArrayList<String> str = new ArrayList<String>(); // non-palidromes
	private static ArrayList<String> palStr = new ArrayList<String>(); // stores palidromes
	
	public static ArrayList<String> getStr() {
		return str;
	}
	
	public static ArrayList<String> getPalStr() {
		return palStr;
	}
	
	public static void seperate(String list[]) {
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals(Q3.rev(list[i]))) { // reverse equals original, using rev in class Q3
				palStr.add(list[i]); // then is palindromic
			}
			else {
				str.add(list[i]);
			}
		}
	}
}
