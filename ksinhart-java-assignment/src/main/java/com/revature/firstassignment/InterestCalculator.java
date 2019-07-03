package com.revature.firstassignment;

import java.util.Scanner;

public class InterestCalculator {
	protected double principal;
	protected double rate;
	protected int time;
	
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
	public void setup(Scanner scanner) {
		System.out.println("Enter principle:");
		this.principal=scanner.nextDouble();
		System.out.println("Enter number of years:");
		this.time = scanner.nextInt();
		System.out.println("Enter interest rate in percent:");
		this.rate = scanner.nextDouble();
		this.rate /= 100.00;
	}
	
	public double calculator() {
		double interest = this.principal*this.rate*this.time;
		return interest;
	}
	
}
