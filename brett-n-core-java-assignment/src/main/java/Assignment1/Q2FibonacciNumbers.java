package Assignment1;

public class Q2FibonacciNumbers {

	public int n1 = 0;
	public int n2 = 1;
	public int n3 = 0;
	
	public void printFib(int count) {
		
		System.out.println(n1); //Print 1st number
		
		for(int i = 0; i < count; i++) { //Loops until specified fibonacci numbers are printed
			
		System.out.println(n2); //Prints 2nd number
		int n3 = n1 + n2; 
		n1 = n2; //Shifts
		n2 = n3;
			
		}
	}
}