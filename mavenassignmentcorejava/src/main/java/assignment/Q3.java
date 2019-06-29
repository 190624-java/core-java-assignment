package assignment;

// reverses a string without using a a temp
public class Q3 {
	
	 public static String rev(String s) {
	     for(int i = s.length() - 1; i >= 0; i--) {
	     	s += s.charAt(i);
	     }
	     return s.substring(s.length() / 2);
	 }
}
