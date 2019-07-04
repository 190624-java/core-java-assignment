import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstQuestion {
	Question1 q1Test = new Question1();
	@Test
	void test() {
		int[] preBubble = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		int[] expectedBubble = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
		int[] bubbleTest = q1Test.bubbleSort(preBubble);
		assertEquals(expectedBubble, bubbleTest);
	}

}
