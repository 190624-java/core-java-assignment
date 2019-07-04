import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//DONE
class ThirdQuestion {
	Question3 q3Test = new Question3();
	String reverseTest;
	@Test
	void test() {
		q3Test.setToReverse("help");
		reverseTest = q3Test.specialReverse();
		assertEquals(reverseTest, "pleh");
	}

}
