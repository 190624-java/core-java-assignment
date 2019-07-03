package assignment;

public class Q6 {
	
	// determines if a number is even without % operator
	public static boolean isEven(int n) {
		n = Math.abs(n); // in case integer is negative
		while(true) {
			if(n == 0) {
				return true;
			}
			if(n == -1) {
				return false;
			}
			n -= 2;
		}
	}
}
