package com.revature.core_java_assignment_jmacias;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import com.revature.q11.Q11;

public class Driver {

	public static void main(String[] args) throws IOException {
		// Q1 - bubble sort
		int[] bSortArray = {1,0,5,6,3,2,3,7,9,8,4};
		System.out.println("Q1 sorted array: ");
		System.out.println(Arrays.toString(Q1.bubbleSort(bSortArray)));
		System.out.println("");
		
		
		// Q2 - first 25 Fibonacci numbers
		System.out.println("Q2 25 Fibonacci numbers:");
		System.out.println(Arrays.toString(Q2.getFibNums()));
		System.out.println("");
		
		
		// Q3 - reverse a string without a temporary variable
		String str = "This is the string in question";
		System.out.println("Q3 reversed string:");
		System.out.println(Q3.reverseString(str));
		System.out.println("");
		
		
		// Q4 - computing N factorial
		int n = 8;
		System.out.println("Q4 " + n + " factorial calculated:");
		System.out.println(Q4.computeFactorial(n));
		System.out.println("");
		
		
		// Q5 - returning a substring given a string and integer
		String str2 = "Supercalifragilisticexpialidocious";
		int idx = 20;
		System.out.println("Q5 Returned substring:");
		System.out.println(Q5.subString(str2, idx));
		System.out.println("");
		
		
		// Q6 - is integer even? no modulus operator
		int num = 181;
		System.out.println("Q6 Is the number even:");
		System.out.println(Q6.isEven(num));
		
		
		// Q7 - Sort two employees based on their name, department,
		// and age using the Comparator
		
		// setting up employee objects and adding them to an arrayList
		Employee e1 = new Employee("Engelbert", "Accounts Paybo", 47);
		Employee e2 = new Employee("Bertha", "Accounts Recibo", 27);
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(e1);
		arr.add(e2);
		System.out.println("");
		// sorting by name and printing out in order
		Collections.sort(arr, new Q7SortByName());
		System.out.println("Q7");
		System.out.println("Name sorted:");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).name + " - " + 
					arr.get(i).department + " - " + 
					arr.get(i).age);
		}
		System.out.println("");
		// sorting by department and printing out in order
		Collections.sort(arr, new Q7SortByDepartment());
		System.out.println("Department sorted:");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).name + " - " + 
					arr.get(i).department + " - " + 
					arr.get(i).age);
		}
		System.out.println("");
		// sorting by age and printing out in order
		Collections.sort(arr, new Q7SortByAge());
		System.out.println("Age sorted:");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).name + " - " + 
					arr.get(i).department + " - " + 
					arr.get(i).age);
		}
		System.out.println("");
		
		// Q8 - create Arraylist of following strings, 
		String a = "karan", 
				b = "madam", 
				c = "tom",
				d = "civic",
				e = "radar",
				f = "jimmy",
				g = "kayak",
				h = "john",
				i = "refer",
				j = "billy",
				k = "did";
		
		ArrayList<String> strArr = Q8.returnPalidromes(a, 
				b, c, d, e, f, g, h, i, j, k);
		// TODO This returned array is storing palindromes, 
		// but as doubles
		System.out.println("Q8 list of palindromes:");
		for (int l = 0; l < strArr.size(); l++) {
			System.out.println(strArr.get(l));
		}
		System.out.println("");
		
		
		// Q9 - Create arraylist with numbers 1-100, prints primes
		
		ArrayList<Integer> primeArr = Q9.printPrimes();
		System.out.println("Q9 primes under 100: ");
		for (int i2 = 0; i2 < primeArr.size(); i2++) {
			System.out.println(primeArr.get(i2));
		}
		System.out.println("");
		
		
		// Q10 - Find the minimum of two numbers using ternary operators.
		
		System.out.println("Q10 minimum of two numbers:\n" + Q10.getMin(-5, 0));
		System.out.println("");
		
		// Q11 - Write a program that would access two float-variables
		// from a class that exists in another package.
		System.out.println("Q11 floats from another package:");
		System.out.println("Floats from com.revature.q11.Q11:\n" + Q11.a + "\n" + Q11.b);
		System.out.println("");
		
		// Q12 - Write a program to store numbers from 1 to 100 in an array.
		// Print out all the even numbers from the array. Use the enhanced 
		// FOR loop for printing out the numbers.
		System.out.println("Q12 evens from an array with an enhanced for loop:");
		Q12.getEvens();
		System.out.println("\n");
		
		// Q13 - Display the triangle on the console as follows using any 
		// type of loop.
		/* 		0
		 * 		1 0
		 * 		1 0 1
		 * 		0 1 0 1
		 */
		// Do NOT use a simple group of print statements to accomplish this.
		
		System.out.println("Q13 right triangle of alternating binary values");
		Q13.printPyramid();
		
		// Q14 - Write a program that demonstrates the switch case. Implement
		// the following functionalities in
//		the cases:java
//		Case 1: Find the square root of a number using the Math class method.
//		Case 2: Display today’s date.
//		Case 3: Split the following string and store it in a string array.
//		“I am learning Core Java”
		
		System.out.println("Q14 three operations using swtich case to read a command parameter:");
		Q14.switchExample("sqrt", 9);
		Q14.switchExample("date", 0);
		Q14.switchExample("split", 0);
		
		// Q15 - Write a program that defines an interface having the
		// following methods: addition, subtraction, multiplication, and 
		// division. Create a class that implements this interface and 
		// provides appropriate functionality to carry out the required 
		// operations. Hard code two operands in a test class having a main
		// method that calls the implementing class.
		
		// See Q15Test class for calling code
		
		// Q16 - Write a program to display the number of characters for a 
		// string input. The string should be entered as a command line 
		// argument using (String [ ] args).
		
		// setting up str variable to take input and argStr variable to take
		// in the first argument
		InputStreamReader iReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(iReader);
		String str3 = bReader.readLine();
		// commented out so this can run without command line
//		String argsStr = args[0];
		
		System.out.println("Q16 String's length:");
		// calling function with user input
		System.out.println(Q16.countString(str3));
		// calling function with first argument (commented out so this can run
		// without using the command line
//		System.out.println(Q16.countString(argsStr));
		
	}

}
