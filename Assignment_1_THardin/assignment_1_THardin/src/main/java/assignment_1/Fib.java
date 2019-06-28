package assignment_1;

import java.util.ArrayList;

class Fib {

	void printFib() {
		ArrayList<Integer> fib = new ArrayList<Integer>();
		
		fib.add(0);
		fib.add(1);
		
		for (int i = 2; i < 25; i++) {
			fib.add(fib.get(i-1) + fib.get(i-2));
		}
		
		for (int i = 0; i < fib.size()-1; i++) {
			System.out.print(fib.get(i) + ", ");
		}
		
		System.out.print(fib.get(fib.size()-1));
		System.out.println();
	}
	
}
