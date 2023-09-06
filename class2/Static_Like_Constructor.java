package com.class2;

public class Static_Like_Constructor {
	int number1;
	static int number2;
	
	static {
		System.out.println("Static Variable Initialize");
		number2 = 100;
	}
	Static_Like_Constructor(){
		number1 = 70;
	}
	
	public static void main(String[] args) {
		System.out.println("The value of number 2 is " + number2);
		Static_Like_Constructor obj = new Static_Like_Constructor();
		System.out.println("value of number 1 is " + obj.number1);
		
	}
}
