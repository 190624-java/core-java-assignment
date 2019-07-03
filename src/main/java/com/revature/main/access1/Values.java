package com.revature.main.access1;

public class Values {

	private float a;
	private float b;

//-------------------------------
//	Constructors
//-------------------------------
	public Values(){
		this.a = 0.0f;
		this.b = 0.0f;
	}
	
	public Values(float a, float b){
		this.a = a;
		this.b = b;
	}

	
//-------------------------------
//		Getters and Setters
//-------------------------------
	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	
	
}
