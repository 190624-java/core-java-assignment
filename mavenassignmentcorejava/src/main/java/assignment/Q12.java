package assignment;

public class Q12 {
	
	private static int a[] = new int[100];

	private static void storeValues() { // 1 to 100 stored	
		for(int i = 0; i < 100; i++) {
			a[i] = i + 1;
		}
	}
	
	//prints all evens in an array from 1 to 100
	public static void printEvens() {
		storeValues();
		for(int x : a) {
			if(x % 2 == 0) System.out.println(x);
		}
	}
}
