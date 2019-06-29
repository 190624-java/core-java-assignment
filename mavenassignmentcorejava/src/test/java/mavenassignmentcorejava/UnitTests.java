package mavenassignmentcorejava;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import assignment.Q1;
import assignment.Q2;
import assignment.Q3;
import assignment.Q4;
import assignment.Q5;

/*
 * JUnit tests for all questions (Q1 to Q20)
 */

public class UnitTests {

	@Test
	// Q1 unit tests
	public void testBubbleSort() {
		int[] a0 = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4}; // arr given in problem
		int[] expect0 = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
		int[] actual0 = Q1.bubbleSort(a0);
		assertArrayEquals(expect0, actual0);
		
		int[] a1 = {-1, -2, -3, -4 };
		int[] expect1 = {-4, -3, -2 , -1};
		int[] actual1 = Q1.bubbleSort(a1);
		assertArrayEquals(expect1, actual1);
		
		int[] a2 = {-100, 3, 0, 0};
		int[] expect2 = {-100, 0, 0, 3};
		int[] actual2 = Q1.bubbleSort(a2);
		assertArrayEquals(expect2, actual2);
	}
	
	@Test
	//Q2 unit tests
	public void testFib() {
		int[] expect0 = {0, 1, 1, 2, 3, 5};
		int[] actual0 = Q2.fib(6);
		assertArrayEquals(expect0, actual0);
		
		int[] expect1 = 
			{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
		int[] actual1 = Q2.fib(25);
		assertArrayEquals(expect1, actual1);
	}
	
	@Test
	//Q3 unit tests
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
}
