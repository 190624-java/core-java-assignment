package assignment_1;

class Enhanced_For {
	
	void setHundred(int[] hundred){
		for(int i = 1; i <= hundred.length; i++) {
			
			hundred[i-1] = i;
			
		}
	}
	
	void printEven(int[] hundred) {
		
		for(int i: hundred) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
	}

}
