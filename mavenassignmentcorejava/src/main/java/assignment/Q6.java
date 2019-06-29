package assignment;

public class Q6 {
	
	// determines if a number is even without % operator
	public static boolean isEven(int n) {
		int origN = n; // holds original value
		n = Math.abs(n); // in case integer is negative
		while(true) {
			if(n == 0) {
				System.out.println(origN + " is Even");
				return true;
			}
			if(n == -1) {
				System.out.println(origN + " is Odd");
				return false;
			}
			n -= 2;
		}
	}
}
