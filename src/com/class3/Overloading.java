package com.class3;

public class Overloading {
	int add(int a, int b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return  a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		System.out.println("Result is "+ obj.add(10, 20));
		System.out.println("Result is "+ obj.add(10, 20, 30));
		System.out.println("Result is "+ obj.add(10.03, 20.55));
		
	}
	
}
