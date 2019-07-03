
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question 1: ");
		Question1 q1 = new Question1();
		q1.bubbleSort();
		System.out.println("Question 2: ");
		Question2 q2 = new Question2();
		q2.printFibonacci();
		System.out.println("\nQuestion 3: ");
		Question3 q3 = new Question3();
		q3.setToReverse("hello world");
		System.out.println(q3.specialReverse());
		System.out.println("Question 4: ");
		Question4 q4 = new Question4();
		q4.setFactorial(11);
		q4.computeFactorial();
		System.out.println("\nQuestion 5: ");
		Question5 q5 = new Question5();
		q5.setIndex(4);
		q5.setString("antidisestablishmentarianism");
		System.out.println(q5.substring());
		System.out.println("Question 6: ");
		Question6 q6 = new Question6();
		q6.setNumber(17);
		System.out.println(q6.isEven());
		System.out.println("Question 7");
		Question7 q7 = new Question7();
		q7.addEmployee("Jim", "Sales", 36);
		q7.addEmployee("Frank", "HR", 34);
		q7.sortEmployees();
		System.out.println("Question 8: ");
		Question8 q8 = new Question8();
		q8.keepPalindromes();
		System.out.println("Question 9: ");
		Question9 q9 = new Question9();
		q9.OneToOneHundredPrimes();
		System.out.println("\nQuestion 10: ");
		Question10 q10 = new Question10();
		q10.setNumOne(4);
		q10.setNumberTwo(5);
		System.out.println(q10.minimumByTernary());
		System.out.println("Question 11: ");
		Question11 q11 = new Question11();
		q11.printTwoVariables();
		System.out.println("Question 12: ");
		Question12 q12 = new Question12();
		q12.arrayEnhancedForLoop();
		System.out.println("\nQuestion 13: ");
		Question13 q13 = new Question13();
		q13.printTriangle();
		System.out.println("Question 14: ");
		Question14 q14 = new Question14();
		q14.switchUseCase(1);
		q14.switchUseCase(2);
		q14.switchUseCase(3);
		System.out.println("Question 15: ");
		Question15 q15 = new Question15();
		q15.setNum1(5);
		q15.setNum2(5);
		System.out.println(q15.add() + " " + q15.subtract() + " " + q15.divide() + " " + q15.multiply());
		System.out.println("Question 16: ");
		Question16 q16 = new Question16();
		//q16.outputString();
		System.out.println("Question 17: ");
		Question17 q17 = new Question17();
		q17.askForInputs();
		System.out.println(q17.calculateInterest());
		System.out.println("Question 18: ");
		Question18 q18 = new Question18();
		q18.setString("hello Friends");
		System.out.println(q18.checkForUppercase());
		System.out.println(q18.convertLowerToUpper());
		System.out.println(q18.stringToIntPlusTen());
		System.out.println("Question 19: ");
		Question19 q19 = new Question19();
		q19.arrayManipulation();
		System.out.println("\nQuestion 20: ");
		Question20 q20 = new Question20();
		q20.read();
	}

}
