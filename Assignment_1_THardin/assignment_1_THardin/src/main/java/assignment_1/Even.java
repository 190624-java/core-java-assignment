package assignment_1;

public class Even {
	
	boolean check(int a) {
		boolean bool = false;
		
		int temp = a/2;
		temp*=2;
		
		if(a==temp) {
			bool = true;
		}
		
		return bool;
	}

}
