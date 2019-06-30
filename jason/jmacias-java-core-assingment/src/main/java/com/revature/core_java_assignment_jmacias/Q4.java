package com.revature.core_java_assignment_jmacias;

public class Q4 {
	// Instructions:
	// Write a program to compute N factorial
	
	public static int computeFactorial(int n) {
		// calculating from n
		int nFactorial = n;
		for (int i = n - 1; i > 1; i--) {
			// multiplying nFactorial, initially = n, to successively
			// decremented numbers, down to one
			nFactorial *= i;
		}
		return nFactorial;
	}

}
