package com.revature.firstassignment;

public class IsEven {
	protected static boolean isEven(int num) {
		int div=num/2;
		int check=div*2;
		if(check==num) {
			return true;
		}
		return false;
	}
}
