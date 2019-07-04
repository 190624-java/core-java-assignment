package assignment;

public class Q5 {
	
	public static String sub(String str, int idx) {
		String subStr = "";
		for(int i = 0; i < idx; i++) {
			subStr += str.charAt(i);
		}
		return subStr;
	}
}
