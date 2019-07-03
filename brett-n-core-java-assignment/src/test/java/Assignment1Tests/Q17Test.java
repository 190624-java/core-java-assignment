package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q17Interest;

public class Q17Test {

	Q17Interest q = new Q17Interest();
	
	@Test
	public void inputChar() { //Should not run due to expecting int, double, int input
							  //Throws InputMismatchException as expected
		q.Calculation();
		
	}
	
}