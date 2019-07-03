package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q18StringClass;

public class Q18Test {

	Q18StringClass q = new Q18StringClass();
	
	
	@Test
	public void input0() {  //Produces correct output, false/0/10
		
		q.stringCheckUpper();
		q.stringLowerToUpper();
		q.stringToInt();
		
	}
	
}