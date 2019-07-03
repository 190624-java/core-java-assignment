package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q10MinimumValue;

public class Q10Test {

	
	Q10MinimumValue q = new Q10MinimumValue(); 
	
	
	@Test
	public void minOfNegatives() {  //Test on using negatives, result should be -20
		
		q.minValue(-20, -5);
		
	}
	
	
}