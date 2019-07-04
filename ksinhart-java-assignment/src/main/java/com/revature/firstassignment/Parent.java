package com.revature.firstassignment;

abstract class Parent {
	abstract boolean anyUppercase(String str);
	abstract String lowerToUpper(String str);
	abstract void turnToInt(String str);
}

class Child extends Parent{

	@Override
	boolean anyUppercase(String str) {
		// TODO Auto-generated method stub
		return str.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*");
	}

	@Override
	String lowerToUpper(String str) {
		// TODO Auto-generated method stub
		return str.toUpperCase();
	}

	@Override
	void turnToInt(String str) {
		// TODO Auto-generated method stub
		int s=Integer.parseInt(str);
		System.out.println(s+10);
		
	}
	
}