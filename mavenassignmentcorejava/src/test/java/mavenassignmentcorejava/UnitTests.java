package mavenassignmentcorejava;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import org.junit.Test;

import assignment.Q1;
import assignment.Q10;
import assignment.Q11;
import assignment.Q12;
import assignment.Q13;
import assignment.Q14;
import assignment.Q19;
import assignment.Q2;
import assignment.Q3;
import assignment.Q4;
import assignment.Q5;
import assignment.Q6;
import assignment.Q8;
import assignment.Q9;
import assignment.q20.Q20;
import assignment.q7.Employee;
import assignment.q7.Q7;

/*
 * JUnit tests for all questions (Q1 to Q20)
 */

public class UnitTests {

	@Test
	// Q1 unit tests
	public void testBubbleSort() {
		int[] a0 = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 }; // arr given in problem
		int[] expect0 = { 0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9 };
		int[] actual0 = Q1.bubbleSort(a0);
		assertArrayEquals(expect0, actual0);

		int[] a1 = { -1, -2, -3, -4 };
		int[] expect1 = { -4, -3, -2, -1 };
		int[] actual1 = Q1.bubbleSort(a1);
		assertArrayEquals(expect1, actual1);

		int[] a2 = { -100, 3, 0, 0 };
		int[] expect2 = { -100, 0, 0, 3 };
		int[] actual2 = Q1.bubbleSort(a2);
		assertArrayEquals(expect2, actual2);
	}

	@Test
	// Q2 unit tests
	public void testFib() {
		int[] expect0 = { 0, 1, 1, 2, 3, 5 };
		int[] actual0 = Q2.fib(6);
		assertArrayEquals(expect0, actual0);

		int[] expect1 = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
				10946, 17711, 28657, 46368 };
		int[] actual1 = Q2.fib(25);
		assertArrayEquals(expect1, actual1);
	}

	@Test
	// Q3 unit tests
	public void testRev() {
		String str = "Reverse this!";
		String expect0 = "!siht esreveR";
		String actual0 = Q3.rev(str);
		assertEquals(expect0, actual0);
	}

	@Test
	// Q4 unit test
	public void testFact() {
		int expect0 = 120;
		int actual0 = Q4.fact(5);
		assertEquals(expect0, actual0);

		int expect1 = 1;
		int actual1 = Q4.fact(0);
		assertEquals(expect1, actual1);
	}

	@Test
	// Q5 unit test
	public void testSub() {
		String expect0 = "Zev";
		String actual0 = Q5.sub("ZevYirmiyahu", 3);
		assertEquals(expect0, actual0);
	}

	@Test
	// Q6 unit test
	public void testIsEven() {
		boolean actual0 = Q6.isEven(0);
		assertEquals(true, actual0);

		boolean actual1 = Q6.isEven(17);
		assertEquals(false, actual1);

		boolean actual2 = Q6.isEven(-10);
		assertEquals(true, actual2);
	}

	@Test
	// Q7 unit test
	public void testSortWithComparator() {
		// Numerical sorting
		ArrayList<Employee> empList1 = new ArrayList<Employee>();
		Employee e1 = new Employee("abc", "Math", 7);
		Employee e2 = new Employee("abc", "Math", 8);

		empList1.add(e2);
		empList1.add(e1);

		Employee[] expectList1 = { e1, e2 };

		Collections.sort(empList1, new Q7());
		assertArrayEquals(expectList1, empList1.toArray());

		// Department alphabetical sorting
		ArrayList<Employee> empList2 = new ArrayList<Employee>();
		Employee e3 = new Employee("abc", "Math", 7);
		Employee e4 = new Employee("abc", "Science", 7);

		empList2.add(e4);
		empList2.add(e3);

		Employee[] expectList2 = { e3, e4 };
		Collections.sort(empList2, new Q7());
		assertArrayEquals(expectList2, empList2.toArray());

		// Name alphabetical sorting
		ArrayList<Employee> empList3 = new ArrayList<Employee>();
		Employee e5 = new Employee("abc", "Math", 7);
		Employee e6 = new Employee("bac", "Math", 7);

		empList3.add(e6);
		empList3.add(e5);

		Employee[] expectList3 = { e5, e6 };
		Collections.sort(empList3, new Q7());
		assertArrayEquals(expectList3, empList3.toArray());
	}
	
	@Test
	// Q8 unit test
	public void testSeperate() {
		String[] a = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did" };
		Q8.seperate(a); // seperate a into two arraylists
		ArrayList<String> actualPal = Q8.getPalStr(); // get arraylists
		ArrayList<String> actualNonPal = Q8.getStr();
		ArrayList<String> expectedPal = new ArrayList<String>();
		ArrayList<String> expectedNonPal = new ArrayList<String>();
		
		//initialize
		expectedPal.add("madam");
		expectedPal.add("civic");
		expectedPal.add("radar");
		expectedPal.add("kayak");
		expectedPal.add("refer");
		expectedPal.add("did");
		expectedNonPal.add("karan");
		expectedNonPal.add("tom");
		expectedNonPal.add("jimmy");
		expectedNonPal.add("john");
		expectedNonPal.add("billy");
		
		assertArrayEquals(expectedPal.toArray(), actualPal.toArray());
		assertArrayEquals(expectedNonPal.toArray(), actualNonPal.toArray());
	}
	
	@Test
	// Q9 unit test
	public void testPrintPrimes() {
		Object[] actual = Q9.Primes().toArray();
		Object[] expect = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,97 };

		assertArrayEquals(expect, actual);
	}
	
	@Test
	// Q10 unit test
	public void testMin() {
		assertEquals(5.0, Q10.min(5, 23), 0.001);
	}
	
	@Test
	// Q11 unit test
	public void testAccessFloats() {
		float[] actual = Q11.AccessFloats();
		assertEquals(1.9F, actual[0], 0.001);
		assertEquals(7.71F, actual[1], 0.001);
	}
	
	@Test
	// Q12 unit test
	public void testPrintEvens() {
		ArrayList<Integer> e = new ArrayList<Integer>();
		for(int i = 2; i <= 100; i +=2) {
			e.add(i);
		}
		assertArrayEquals(e.toArray() ,Q12.printEvens().toArray());
	}
	
	@Test
	// Q13 unit test
	public void testPrintSeq() {
		Q13.printSeq();
		ArrayList<String> expect = new ArrayList<String>();
		expect.add("0");
		expect.add("10");
		expect.add("101");
		expect.add("0101");
		assertArrayEquals(expect.toArray(), Q13.output.toArray());
	}
	
	// Q14 unit test
	
	// Q15 unit test
	
	// Q16 unit test
	
	// Q17 unit test
	
	// Q18 unit test
	
	@Test
	// Q19 unit test
	public void testNums() {
		ArrayList<Integer> expect = new ArrayList<>();
		expect.add(1);
		expect.add(3);
		expect.add(4);
		expect.add(6);
		expect.add(8);
		expect.add(9);
		expect.add(10);
		assertArrayEquals(expect.toArray(), Q19.testNums().toArray());
	}
	
	// Q20 unit test
	@Test
	public void testCaller()  {
		assertEquals("Mickey", Q20.testQ20());
	}
}
