import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FifthQuestion {
	Question5 q5Test = new Question5();
	@Test
	void test() {
		q5Test.setIndex(3);
		q5Test.setString("help");
		String sub = q5Test.substring();
		assertEquals(sub, "he");
	}

}
