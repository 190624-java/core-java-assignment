import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondQuestion {
Question2 q2Test = new Question2();

	@Test
	void test() {
		int[] trueFibArray = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025};
		int[] expectedFibArray = q2Test.printFibonacci();
		assertEquals(trueFibArray, expectedFibArray);
	}

}
