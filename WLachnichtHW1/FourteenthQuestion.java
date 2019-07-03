import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FourteenthQuestion {
Question14 q14Test = new Question14();
	@Test
	void test() {
		q14Test.switchUseCase(1);
		assertEquals(6.0, q14Test.foundSqRoot);
	}

}
