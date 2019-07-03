import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeventeenthQuestion {
Question17 q17Test = new Question17();
	@Test
	void test() {
		q17Test.setPrincipal(17);
		q17Test.setRate(10);
		q17Test.setTime(10);
		int result = q17Test.calculateInterest();
		assertEquals(result, 1700);
	}

}
