package assignment_1;

import java.util.Scanner;

public class InterestCalc {
	
	public static void interest(Scanner scanner) {
		System.out.println("Please enter the intrest rate as a decimal.");
		double interest = scanner.nextDouble()+1;
		System.out.println("Please enter the loan amount.");
		double principle = scanner.nextDouble();
		System.out.println("Please enter the time passed in years.");
		int time = scanner.nextInt();
		System.out.println("The new amount with interest is: " + interest*principle*time);
	}

}
