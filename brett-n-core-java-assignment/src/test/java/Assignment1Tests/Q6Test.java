package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q6IsEven;

public class Q6Test {

	Q6IsEven tester = new Q6IsEven();
	
	@Test
	public void negativeValueTest() {	//IsEven uses a flag to determine whether an integer is even
										//The flag starts as true and the loop begins at 1
										//Therefore using a negative number should always return true(or Even)
		System.out.println(Q6IsEven.isEven(-87));
		
	}
	
}