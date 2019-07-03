package Assignment1Tests;

import org.junit.Test;

import Assignment1.Q16UserString;

public class Q16Test {

	
	Q16UserString q = new Q16UserString();
	
	@Test
	public void inputStringWithWhiteSpace() { //Produces incorrect output due to using input.next()
		
		q.numOfCharacters();
		
	}
	
	
}
