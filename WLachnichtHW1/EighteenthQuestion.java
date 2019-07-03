import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EighteenthQuestion {
Question18 q18Test = new Question18();
	@Test
	void testForCaps() {
		q18Test.setString("Hello");
		boolean check = q18Test.checkForUppercase();
		assertEquals(true, check);
	}
	@Test
	void changeToAllCaps()
	{
		q18Test.setString("hello");
		String str = q18Test.convertLowerToUpper();
		assertEquals("HELLO", str);
	}

	@Test
	void testNumericalConversion()
	{
		q18Test.setString("hola");
		int num = q18Test.stringToIntPlusTen();
		assertEquals(82, num);
	}
}
