import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeventhQuestion {
Question7 q7Test = new Question7();
	@Test
	void test() {
		
		q7Test.addEmployee("Bob", "Sales", 23);
		q7Test.addEmployee("Alan", "HR", 44);
		q7Test.sortEmployees();
		assertEquals("Alan", q7Test.eList.get(0).getName());
	}

}
