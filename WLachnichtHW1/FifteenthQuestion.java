import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FifteenthQuestion {
	Question15 q15Test = new Question15();
	@Test
	void addtest() {
		q15Test.setNum1(5);
		q15Test.setNum2(10);
		int addresult = q15Test.add();
		assertEquals(addresult, 15);
	}
	@Test
	void subtractTest()
	{
		q15Test.setNum1(11);
		q15Test.setNum2(4);
		int subtractResult = q15Test.subtract();
		assertEquals(subtractResult, 7);
	}
	@Test
	void multiplyTest()
	{
		q15Test.setNum1(3);
		q15Test.setNum2(8);
		int multiplyResult = q15Test.multiply();
		assertEquals(multiplyResult, 24);
	}
	@Test
	void divideTest()
	{
		q15Test.setNum1(16);
		q15Test.setNum2(4);
		int divideResult = q15Test.divide();
		assertEquals(divideResult, 4);
	}
}
