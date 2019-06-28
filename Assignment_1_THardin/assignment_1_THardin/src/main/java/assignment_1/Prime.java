package assignment_1;
import java.util.ArrayList;
import java.util.Arrays;

class Prime {
	
	void primecalc(int[] numbs, ArrayList<Integer> primes) {
		
		boolean[] checked = new boolean[numbs.length+1];
		
		Arrays.fill(checked, true);
		
		for(int i = 2; i < numbs.length; i++) {
			if(checked[i]) {
				primes.add(i);
				for(int j=i; j <= 100; j+=i) {
					checked[j] = false;
				}
			}	
		}
		
		for(int i = 0; i < primes.size()-1; i++) {
			System.out.print(primes.get(i)+", ");
		}
		System.out.println(primes.get(primes.size()-1));
	}
	

}
