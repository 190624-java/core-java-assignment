package assignment_1;

class Rev_String {
	
	String revString(String rev) {
		int n = rev.length();
		for (int i = n-1; i >= 0; i--) {
			rev+= rev.charAt(i);
			
		}
		rev = rev.substring(n, rev.length());
		return rev;
	}

}
