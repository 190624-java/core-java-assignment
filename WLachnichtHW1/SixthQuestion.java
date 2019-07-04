import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SixthQuestion {

	Question6 q6Test = new Question6();
	@Test
	void test() {
		q6Test.setNumber(7);
		boolean test = q6Test.isEven();
		assertEquals(test, false);
	}

}
