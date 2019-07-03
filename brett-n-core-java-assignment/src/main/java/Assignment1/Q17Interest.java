package Assignment1;
import java.util.Scanner;

public class Q17Interest {

	public int principal;
	public double rate;
	public int years;
	public double interest;
	
	Scanner input = new Scanner(System.in);
	
	public void Calculation() {
		
		System.out.println("Enter the principal amount: ");
		principal = input.nextInt();
		
		System.out.println("Enter the rate of interest: ");
		rate = input.nextDouble();
		
		System.out.println("Enter the number of years: ");
		years = input.nextInt();
		
		System.out.println("The amount of interest is ");
		System.out.println(principal * rate * years);
		
	}
	
}
