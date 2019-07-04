import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//DONE
class FourthQuestion {
	Question4 q4Test = new Question4();
	@Test
	void test() {
		q4Test.setFactorial(7);
		int factorialResult = q4Test.computeFactorial();
		assertEquals(factorialResult, 5040);
	}

}
