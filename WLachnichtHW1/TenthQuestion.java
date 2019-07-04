import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TenthQuestion {
	Question10 q10Test = new Question10();
	@Test
	void test() {
		q10Test.setNumOne(7);
		q10Test.setNumberTwo(11);
		int min = q10Test.minimumByTernary();
		assertEquals(min, 7);
	}

}
