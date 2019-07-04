package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q4Factorial;

public class Q4Test {

	Q4Factorial tester = new Q4Factorial();
	
	@Test
	public void passingNegativeValue() { //Should result in 1 due to loop constraint
		
		System.out.println(Q4Factorial.factorial(-90));
		
	}
	
}
