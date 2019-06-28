package assignment_1;

class Triangle {
	
	void print() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
	}

}
