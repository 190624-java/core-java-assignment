import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NineteenthQuestion {
Question19 q19Test = new Question19();
	@Test
	void test() {
		q19Test.arrayManipulation();
		assertEquals(4, q19Test.arrayL.get(0));
	}

}
