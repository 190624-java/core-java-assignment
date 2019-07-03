package com.revature.firstassignment;

import java.io.IOException;
import java.util.Scanner;

public class AssignmentDriver implements Mathmatics{ //extends CoreJava{
	
	
	void test(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(Factorial.factorial(4));
		System.out.println(Factorial.factorial(-3));
		int[] array= {1,0,5,6,3,2,3,7,9,8,4};
		BubbleSort.bubble(array);
		Fibonacci.fibonacci();
		System.out.println(new ReverseString().reverseString("water"));
		System.out.println(new IsEven().isEven(5));
		System.out.println(new IsEven().isEven(6));
		
		System.out.println(new Substring().substring("Charmander", 4));
		String[] array1= {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};	
		Palindrome.palindrome(array1);
		
		PrimePrint.primePrint();
		
		System.out.println(Ternary.findMin(4, 15));
		System.out.println(Ternary.findMin(41, 15));
		FloatTest.floatAccess();
		PrintEven.printEven();
		TrianglePrint.printTriangle();
		
		Employee e=new Employee("Jake","Sales",35);
		Employee f=new Employee("Amy","Human Resources",31);
		System.out.println(new EmployeeNameComparator().compare(e,f));
		System.out.println(new EmployeeNameComparator().compare(f,e));
		System.out.println(new EmployeeNameComparator().compare(e,e));
		
		System.out.println(new EmployeeDepartmentComparator().compare(e,f));
		System.out.println(new EmployeeDepartmentComparator().compare(f,e));
		System.out.println(new EmployeeDepartmentComparator().compare(e,e));
		
		System.out.println(new EmployeeAgeComparator().compare(e,f));
		System.out.println(new EmployeeAgeComparator().compare(f,e));
		System.out.println(new EmployeeAgeComparator().compare(e,e));
		
		
		new SwitchCases().switchCases(scanner);
		ArrayListMod.arrayListMod();
		
		InterestCalculator ic = new InterestCalculator();
		ic.setup(scanner);
		System.out.println(ic.calculator());
		
		//NEED TO ASK JESSICA ABOUT THAT
		System.out.println(StringCharCount.stringCharCount(scanner));
		
		try {
			new ReadFile().readFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Child kid=new Child();
		System.out.println(kid.anyUppercase("qwerTy"));
		System.out.println(kid.lowerToUpper("How does tHis work"));
		kid.turnToInt("14");
		//System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AssignmentDriver().test(args);
	}

	
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		return a+b;
	}

	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		return a-b;
	}

	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		return a*b;
	}

	public int division(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		return a/b;
	}
	

}
