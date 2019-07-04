//Question: Write a program that calculates the simple interest on the principal, rate of interest and number of years provided by the user. Enter principal, rate and time through the console using the Scanner class.
//DONE
import java.util.*;
public class Question17 {
public static int principal;
public static int rate;
public static int time;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input principal: ");
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt()) {
			while (!scanner.hasNextInt()) {
				System.out.println("Error. Incorrect input type. Please input the principal as an integer: ");
				scanner.next();
			}
			principal = scanner.nextInt();
		} else {
			principal = scanner.nextInt();
		}
		System.out.println("Please input rate of interest: ");
		if (!scanner.hasNextInt()) {
			while (!scanner.hasNextInt()) {
				System.out.println("Error. Incorrect input type. Please input the rate as an integer: ");
				scanner.next();
			}
			rate = scanner.nextInt();
		} else {
			rate = scanner.nextInt();
		}
		System.out.println("Please input time: ");
		if(!scanner.hasNextInt())
		{
			while(!scanner.hasNextInt())
			{
				System.out.println("Error. Incorrect input type. Please input the number of years as an integer");
				scanner.next();
			}
			time = scanner.nextInt();
		}
		else
		{
			time = scanner.nextInt();
		}
		System.out.println(calculateInterest(principal, rate, time));
		scanner.close();
		
	}
	public static void askForInputs()
	{
		System.out.println("Please input principal: ");
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt()) {
			while (!scanner.hasNextInt()) {
				System.out.println("Error. Incorrect input type. Please input the principal as an integer: ");
				scanner.next();
			}
			principal = scanner.nextInt();
		} else {
			principal = scanner.nextInt();
		}
		System.out.println("Please input rate of interest: ");
		if (!scanner.hasNextInt()) {
			while (!scanner.hasNextInt()) {
				System.out.println("Error. Incorrect input type. Please input the rate as an integer: ");
				scanner.next();
			}
			rate = scanner.nextInt();
		} else {
			rate = scanner.nextInt();
		}
		System.out.println("Please input time: ");
		if(!scanner.hasNextInt())
		{
			while(!scanner.hasNextInt())
			{
				System.out.println("Error. Incorrect input type. Please input the number of years as an integer");
				scanner.next();
			}
			time = scanner.nextInt();
		}
		else
		{
			time = scanner.nextInt();
		}
		scanner.close();
	}
	public static int calculateInterest(int principal, int rate, int time)
	{
		int interest = principal * rate * time;
		return interest;
	}
	public static int calculateInterest()
	{
		int interest = principal * rate * time;
		return interest;
	}
	public static void setPrincipal(int i)
	{
		principal = i;
	}
	public static void setRate(int i)
	{
		rate = i;
	}
	public static void setTime(int i)
	{
		time = i;
	}
}
