package assignment;

public class Q4 {

	//factorial function iterative approach
	 public static int fact(int n) {
		 int prod = 1; // initialize
	     while(n != 0) {
	         prod *= n;
	         n--;
	     }
	     return prod;
	 }
	 
// recursive approach (heavy on stack)
//	 public int fact(int n) {
//		 if(n == 0) return 1;
//		 else return n * fact(n - 1);
//	 }
}
