package Assignment1;

import java.util.ArrayList;

public class Q19ArrayList {

	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	int temp = 0;
	int temp2 = 0;

	public void megaArray() {

		for (int i = 0; i < 11; i++) {
			arr.add(i);
		}
		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) {

			if (arr.indexOf(i) % 2 == 0) {
				temp += i;
			} else if (arr.indexOf(i) % 2 == 1) {
				temp2 += i;
			}
		}

		System.out.println(temp);
		System.out.println(temp2);

		for (int i = 0; i < arr.size(); i++) {

			if (isPrime(arr.get(i))) {
				arr.remove(i);
			}
		}
		
		System.out.println(arr);
		
	}

	public boolean isPrime(int n) {

		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				return false;
			}
		return true;
		
	}

}