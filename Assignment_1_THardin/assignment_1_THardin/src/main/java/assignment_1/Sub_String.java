package assignment_1;

public class Sub_String {
	
	String sub(String str, int idx) {
		
		String temp="";

		for(int i = 0; i < idx; i++) {
			temp+=str.charAt(i);
		}
		
		return temp;
	}

}
