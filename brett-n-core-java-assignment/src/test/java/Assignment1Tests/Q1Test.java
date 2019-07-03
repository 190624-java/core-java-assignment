package Assignment1Tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import Assignment1.Q1BubbleSort;

public class Q1Test {

	Q1BubbleSort tester = new Q1BubbleSort(); // BubbleSort is tested

	int[] arr = { 1, 3, 2, 0, -1, -2, -3 };
	int[] result = { -3, -2, -1, 0, 1, 2, 3 };

	@Test
	public void positiveIntegerTest() {  //Test to see if bubblesort works with negative integers,
										 //and if they return the same result
		tester.bubbleSort(arr);
		assertArrayEquals(arr, result);

	}
}