package assignment;

import java.util.ArrayList;
import java.util.Collections;

import assignment.q20.Q20;
import assignment.q7.Employee;
import assignment.q7.Q7;

public class Main {
	
	private void printArray(int[] arr) {
		System.out.print("{ ");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.print("}");
	}
	
	private void printArrayList(ArrayList<String> al) {
		System.out.print("{ ");
		for(String s : al) {
			System.out.print(s + " ");
		}
		System.out.println("}");
	}
	
	private void printEmployeeList(ArrayList<Employee> al) {
		for(Employee e : al) {
			System.out.println("Name: " + e.getName());
			System.out.println("Department: " + e.getDepartment() );
			System.out.println("Age: " + e.getAge());
		}
	}
	
	// creates all objects and invokes desired method
	private void driver() {
		
		
		System.out.println("\n---------------- Q1 ---------------- ");
		int[] arr = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4}; // arr given in problem
		int[] arrSorted = Q1.bubbleSort(arr);
		printArray(arrSorted);
		
		System.out.println("\n---------------- Q2 ---------------- ");
		int[] fibs = Q2.fib(25); // prints first 25 fibbonacci number beginning at 0
		printArray(fibs);
		
		System.out.println("\n---------------- Q3 ---------------- ");
		System.out.println(Q3.rev("Hello World!")); // reverse this string
		
		System.out.println("\n---------------- Q4 ---------------- ");
		System.out.println(Q4.fact(5)); // factorial of a number
		
		System.out.println("\n---------------- Q5 ---------------- ");
		String result = Q5.sub("Hyperactive",  5); // return substring from 0 to idx - 1
		System.out.println(result); // shoudl print "Hyper"
		
		System.out.println("\n---------------- Q6 ---------------- ");
		Q6.isEven(8); //even
		Q6.isEven(17); // odd
		Q6.isEven(0); // even
		Q6.isEven(-2); // even
		
		System.out.println("\n---------------- Q7 ---------------- ");
		ArrayList<Employee> employees = new ArrayList<Employee>(); // make employee test list
		Employee e1 = new Employee("Zev", "Mathematics", 30);
		Employee e2 = new Employee("Bob", "Science", 28);
		Employee e3 = new Employee("Tina", "History", 25);
		Employee e4 = new Employee("Zack", "History", 30);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		System.out.println("BEFORE SORT");
		System.out.println("-------------------");
		printEmployeeList(employees); // before sort
		
		Collections.sort(employees, new Q7()); //sort
		
		System.out.println("\nAFTER SORT");
		System.out.println("-------------------");
		printEmployeeList(employees); // after sort
		
		System.out.println("\n---------------- Q8 ---------------- ");
		String[] q8Array = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did" };
		Q8.seperate(q8Array);
		ArrayList<String> nonPal = Q8.getStr(); // non-palindromic
		ArrayList<String> pal = Q8.getPalStr(); // palindromic
		printArrayList(nonPal);
		printArrayList(pal);
		
		System.out.println("\n---------------- Q9 ---------------- ");
		Q9.printPrimes();
		
		System.out.println("\n---------------- Q10 ---------------- ");
		System.out.println(Q10.min(1.7, 1.9)); // 1.7 is minimum
		System.out.println(Q10.min(-13, -17)); // -17 is minimum
		
		System.out.println("\n---------------- Q11 ---------------- ");
		Q11.AccessFloats(); // prints 2 floats in another package
		
		System.out.println("\n---------------- Q12 ---------------- ");
		Q12.printEvens(); // constructor calls printEvens() method
		
		System.out.println("\n---------------- Q13 ---------------- ");
		Q13.printSeq();
		
		System.out.println("\n---------------- Q14 ---------------- ");
		Q14.switchDemo(1); // case 1
		Q14.switchDemo(2); // case2
		Q14.switchDemo(3); // case 3
		
		// Q15 has its own main method
		// Run from its own class
		
		// Q16 has its own main method
		
		// Q17 has its own main method
		
		System.out.println("\n---------------- Q19 ---------------- ");
		Q19.caller();
		
		System.out.println("\n---------------- Q20 ---------------- ");
		Q20.caller(0); // parameter specifies the record
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.driver(); 
	}
}
