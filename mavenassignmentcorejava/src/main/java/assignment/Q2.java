package assignment;

//prints first 25 Fibonacci numbers
public class Q2 {
	
	public static int[] fib(int n) {
		 int a[] = new int[n];
		 a[0] = 0; // initialize
		 a[1] = 1; 
		 for(int i = 2; i < a.length; i++) {
		     a[i] = a[i - 1] + a[i - 2]; 
		 }
		 return a;
	}
}
