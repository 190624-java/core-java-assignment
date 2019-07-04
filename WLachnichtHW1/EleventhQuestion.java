import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EleventhQuestion {
Question11 q11Test = new Question11();
	@Test
	void test() {
		float var1 = q11Test.getVar1();
		assertEquals(0.25f, var1);
	}
	@Test
	void test2()
	{
		float var2 = q11Test.getVar2();
		assertEquals(2.87f, var2);
	}
}
