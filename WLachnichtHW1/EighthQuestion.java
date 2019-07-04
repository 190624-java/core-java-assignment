import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EighthQuestion {
Question8 q8Test = new Question8();
	@Test
	void test() {
		q8Test.keepPalindromes();
		assertEquals("did", q8Test.palindromes.get(5));
	}

}
