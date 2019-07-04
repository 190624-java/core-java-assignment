package assignment;

import java.util.Scanner;

public class Q17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principal: ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter rate: ");
		double rate = sc.nextDouble();
		
		System.out.print("Enter time: ");
		double time = sc.nextDouble();
		double result = principal * rate * time;
		System.out.println("The simple interest = " + result);
		sc.close();
	}
}
