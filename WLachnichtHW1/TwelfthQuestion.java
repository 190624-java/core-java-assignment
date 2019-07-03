import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwelfthQuestion {
Question12 q12Test = new Question12();
	@Test
	void test() {
		q12Test.arrayEnhancedForLoop();
		assertEquals(2, q12Test.array[1]);
	}

}
