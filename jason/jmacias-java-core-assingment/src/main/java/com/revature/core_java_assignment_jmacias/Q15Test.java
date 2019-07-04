package com.revature.core_java_assignment_jmacias;

public class Q15Test {

	public static void main(String[] args) {
		int a = 21;
		int b = 7;
		// making an object from class Q15 and using its functions
		Q15 obj = new Q15();
		int addResult = obj.add(a, b);
		int subResult = obj.subtract(a, b);
		int multResult =obj.multipy(a, b);
		int divResult =obj.divide(a, b);
		System.out.println("Q15 results of four operations");
		System.out.println("Addition: " + a + " + " +  b + " = " + addResult);
		System.out.println("Subtraction: " + a + " - " + b + " = " + subResult);
		System.out.println("Multiplication: " + a + " x " + b + " = " + multResult);
		System.out.println("Division: " + a + " / " + b + " = " + divResult);
	}

}
