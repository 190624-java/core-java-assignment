import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NinthQuestion {
Question9 q9Test = new Question9();
	@Test
	void test() {
		q9Test.OneToOneHundredPrimes();
		assertEquals(2, q9Test.primeCheck.get(1));
	}

}
