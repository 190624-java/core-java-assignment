package com.revature.firstassignment;

import java.util.ArrayList;
import com.revature.*;

public class ArrayListMod {
	
	public static void arrayListMod() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a=1;
		while (a<=10) {
			list.add(a);
			a++;
		}
		System.out.println(list);
		
		int evenCount = 0;
		int oddCount = 0;
		for(int n: list) {
			if(IsEven.isEven(n)) {
				evenCount+=n;
			}
			else {
				oddCount+=n;
			}
		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);
		
		ArrayList<Integer> noPrime = list;//new ArrayList<Integer>();
		//cannot be enhanced for loop
		
		for(int m=0;m<10;m++) {
			if(PrimePrint.isPrime(m)) {
				noPrime.remove((Integer) m);
			}
		}
		
		
		System.out.println(noPrime);
		
	}
}
