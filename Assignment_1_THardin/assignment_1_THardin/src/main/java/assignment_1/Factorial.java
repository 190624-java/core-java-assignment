package assignment_1;

class Factorial {

	int factorial (int n) {
		int fact = 1;
		
		if(n<0) {
			System.out.println("N must be greater than or equal to 0");
			return -1;
		}
			
		
		if(n == 0)
			fact = 1;
		
		for(int i = n; i > 0; i--) {
			fact*=i;
		}
		
		return fact;
		
	}
	
}
