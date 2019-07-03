package com.revature.main;

import java.util.Scanner;

import com.revature.main.access2.Accessor;
import com.revature.utilities.GetLooper;
import com.revature.utilities.GetStringLooper;
import com.revature.utilities.IOHelper;

public class ProjectDriver {
	private static Scanner scanner;
	private static IOHelper io;

	public static void main(String[] args) {
		 scanner = new Scanner(System.in);
		 io = new IOHelper();
		 
		for(int i =0; i<args.length; i++) {
			System.out.println("Argument '" + i + "' is: " + args[i]);
		}
		//Project0 Part 1 - Due Wed. July, 3rd, 2019 at 9am.
		
		
//		Q1. Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4

		/*
		System.out.println("Q1 - doing Bubble Sort on Assignment Array");
		Bubbler bubbler = new Bubbler();
		//int[] a = bubbler.doDefaultSort();
		//bubbler.equals(a,)
		*/
		
//		Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.

		//TODO make it recursive 
		//TODO make unit test
//		System.out.println("Q2 - Showing first 25 numbers of fibonacci sequence");
//		Fibi fibi = new Fibi();
//		fibi.show25();
//		System.out.println("\n");
		
//		Q3. Reverse a string without using a temporary variable.  
		//Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
		
//		System.out.println("Q3 - Reverse a string");
//		StringReverser sr = new StringReverser();
//		System.out.println("The reverse of Revature is: "+ sr.reverse("Revature"));
//		System.out.println("\n");

//		Q4. Write a program to compute N factorial.
		
//		NFactorial nFactorial = new NFactorial();
//		Scanner factorialScanner = new Scanner(System.in);
//		System.out.println("Q4 - Computing N Factorial");
//		System.out.print("Enter a number for n-factorial computation: ");
//		int factorialInput = Integer.valueOf(factorialScanner.next());
//		System.out.println("N Factorial of \""+factorialInput+"\" is: "+ 
//		nFactorial.doFactorial(factorialInput));		
//		
//		System.out.println("\n");
		
		
		
		
		
		
		
//		Q5. Write a substring method that accepts a string str and an integer idx and returns 
		//the substring contained between 0 and idx-1 inclusive.  Do NOT use any of the existing 
		//substring methods in the String, StringBuilder, or StringBuffer APIs.
		
		System.out.println("Enter a string of text to extract from: ");
		String stringToExtractFrom;
		stringToExtractFrom = scanner.nextLine();
		int endExtractionIndex;
		
		if(scanner.hasNextInt()) {
		endExtractionIndex = scanner.nextInt();
		}else System.out.println("Error: didn't enter a valid int value.");
		
		
		
		System.out.println("\n");
		
		
		
		
		
		
		
//		Q6. Write a program to determine if an integer is even without using the modulus 
		//operator (%)
		
//		Modulator m = new Modulator();
//		System.out.println("Q6: Enter a value to determine if it is even: ");
//		if(scanner.hasNextInt()) {
//			int value = scanner.nextInt();
//			m.printIsEven(value);
//		}		
//		
//		System.out.println("\n");
		
		
		
		
		//Q7. Sort two employees based on their name, department, and age using the Comparator 
		//interface.
		
//		System.out.println("Q7: Sorting 2 employee's by: name, department, and age");
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		
//		boolean c1 = true;
//		do{
//			System.out.println("Enter employee's department: ");
//			
//			c1 = io.getContinueReply(scanner);
//		}while (c1==true) {
//			
//		}
//		GetStringLooper employeeGetter = new GetStringLooper("Enter employee's name: ", "");
//		e1.setName(employeeGetter.getAndReturn());
//		employeeGetter.changeInstruction("Enter employee's department: ","");
//		employeeGetter.getAndReturn();
//		
//		
//		System.out.println("\n");
//		
		
		
		
		//Q8. Write a program that stores the following strings in an ArrayList and saves all the 
		//palindromes in another ArrayList.
//		“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, 
		//“did”

		
//		Palindromer pal = new Palindromer();
//		
//		System.out.println("\n");		
		
//		Q9. Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime 
		//numbers to the console.
		
		PrimeFinder pf = new PrimeFinder();
		
		
		System.out.println("\n");
		
		
		
		
//		==================================================================
		
		
		
		
		
//		Q10. Find the minimum of two numbers using ternary operators.
		
		TernaryMinFinder tmf = new TernaryMinFinder();
		
		System.out.println("\n");
//		Q11. Write a program that would access two float-variables from a class that exists in 
		//another package. Note, you will need to create two packages to demonstrate the solution.
		
		Accessor accessor = new Accessor();
		
		
		System.out.println("\n");
//		Q12. Write a program to store numbers from 1 to 100 in an array. Print out all the even 
		//numbers from the array. Use the enhanced FOR loop for printing out the numbers.
		
		EnhancedFor ef = new EnhancedFor();
		
//		Q13. Display the triangle on the console as follows using any type of loop.  Do NOT use a 
		//simple group of print statements to accomplish this.  
//			0 
//			1 0
//			1 0 1
//			0 1 0 1
		BinaryTriangle bt = new BinaryTriangle();
		
		System.out.println("\n");
		
		
//		Q14. 
//		Write a program that demonstrates the switch case. Implement the following 
		//functionalities in the cases:java
//		Case 1: Find the square root of a number using the Math class method.
//		Case 2: Display today’s date.
//		Case 3: Split the following string and store it in a string array.
//		       	 “I am learning Core Java”
		
		Cases cases = new Cases();
		
		System.out.println("\n");
//		Q15. Write a program that defines an interface having the following methods: 
		//addition, subtraction, multiplication, and division. Create a class that implements 
		//this interface and provides appropriate functionality to carry out the required 
		//operations. Hard code two operands in a test class having a main method that calls 
		//the implementing class.
		System.out.println("\n");
//		Q16. Write a program to display the number of characters for a string input. The 
		//string should be entered as a command line argument using (String [ ] args).
		System.out.println("\n");
//		Q17. Write a program that calculates the simple interest on the principal, rate of 
		//interest and number of years provided by the user. Enter principal, rate and 
		//time through the console using the Scanner class.
//		Interest = Principal* Rate* Time
		System.out.println("\n");
//		Q18. Write a program having a concrete ;subclass that inherits three abstract 
		//methods from a superclass.  Provide the following three implementations in the 
		//subclass corresponding to the abstract methods in the superclass:
//		 
//		1.          	Check for uppercase characters in a string, and return ‘true’ or ‘false’ 
		//depending if any are found.
//		2.          	Convert all of the lower case characters to uppercase in the input 
		//string, and return the result.
//		3.          	Convert the input string to integer and add 10, output the result 
		//to the console.
//		Create an appropriate class having a main method to test the above setup.
		System.out.println("\n");
//		Q19. Create an ArrayList and insert integers 1 through 10. Display the ArrayList. 
		//Add all the even numbers up and display the result. Add all the odd numbers up 
		//and display the result. Remove the prime numbers from the ArrayList and print out 
		//the remaining ArrayList.
		System.out.println("\n");
//		Q20. Create a notepad file called Data.txt and enter the following:
//		Mickey:Mouse:35:Arizona
//		Hulk:Hogan:50:Virginia
//		Roger:Rabbit:22:California
//		Wonder:Woman:18:Montana
//		 
//		Write a program that would read from the file and print it out to the screen 
		//in the following format:
//		 
//		Name: Mickey Mouse
//		Age: 35 years
//		State: Arizona State

		
	}
	


}
