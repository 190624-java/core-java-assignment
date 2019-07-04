package com.revature.firstassignment;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstAssignmentJUnit {
	static Scanner scanner;
	
	@BeforeClass
	public static void setUp() throws Exception {
		scanner = new Scanner(System.in);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void arrayListModTest() {
		fail("Not yet implemented");
	}@Test
	public void bubbleSorttest() {
		fail("Not yet implemented");
	}
	@Test
	public void employeeTest() {
		Employee e=new Employee("Jake","Sales",35);
		Employee f=new Employee("Amy","Human Resources",31);
		assertEquals(9,new EmployeeNameComparator().compare(e,f));
		assertEquals(-9,new EmployeeNameComparator().compare(f,e));
		assertEquals(0,new EmployeeNameComparator().compare(e,e));
		
		assertEquals(11,new EmployeeDepartmentComparator().compare(e,f));
		assertEquals(-11,new EmployeeDepartmentComparator().compare(f,e));
		assertEquals(0,new EmployeeDepartmentComparator().compare(e,e));
		
		assertEquals(1,new EmployeeAgeComparator().compare(e,f));
		assertEquals(-1,new EmployeeAgeComparator().compare(f,e));
		assertEquals(0,new EmployeeAgeComparator().compare(e,e));
	}
	@Test
	public void factorialTest() {
		assertEquals(24,Factorial.factorial(4));
		assertEquals(0,Factorial.factorial(0));
		assertEquals(-2,Factorial.factorial(-2));
	}
	@Test
	public void fibonacciTest() {
		fail("Not yet implemented");
	}
	@Test
	public void floatTTest() {
		fail("Not yet implemented");
	}
	@Test
	public void interestCalcTest() {
		InterestCalculator p=new InterestCalculator();
		p.setup(scanner);
		double d=p.calculator();
		
		
	}
	@Test
	public void isEvenTest() {
		assertEquals(true,IsEven.isEven(4));
		assertEquals(false,IsEven.isEven(7));
		
		assertEquals(true,IsEven.isEven(0));
	}
	@Test
	public void palindromeTest() {
		fail("Not yet implemented");
	}
	@Test
	public void parentStrTest() {
		Child c = new Child();
		assertEquals(true,c.anyUppercase("qwWW"));
		assertEquals(false,c.anyUppercase("qwww"));
		assertEquals(false,c.anyUppercase(""));
		
		assertEquals("HELLO",c.lowerToUpper("heLLo"));
		assertEquals("HELLO",c.lowerToUpper("HELLO"));
		
	}
	@Test
	public void printEvenTest() {
		fail("Not yet implemented");
	}
	@Test
	public void reverseStringTest() {
		assertEquals("retaw",ReverseString.reverseString("water"));
		assertEquals("retaW",ReverseString.reverseString("Water"));
	}
	@Test
	public void stringCharCountTest() {
		fail("Not yet implemented");
	}
	@Test
	public void substringTest() {
		assertEquals("Char",new Substring().substring("Charmander", 4));
	}
	@Test
	public void ternaryTest() {
		assertEquals(3, Ternary.findMin(5, 3));
		assertEquals(3, Ternary.findMin(3, 5));
	}
	@AfterClass
	public static void teardownClass() {
		scanner.close();
	}
}
