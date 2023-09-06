package com.class9;
//Time Complexity is
//instead of measuring actual time required in executing each statement
//Time Complexity Consider how many times each statement execute 
public class TimeComplexity {
	public static void main(String[] args) {
		System.out.println("Hello World");   //O(1)
		display();
	}
	static void display() {
		int n = 8;
		for(int i=0;i<n;i++) {
			System.out.println("Hello Wolrd !");  //O(n)
		}
		
		for(int i=1;i<n;i=i*2) {
			System.out.println("Hello Wolrd !!");  //O(log(n))
		}
		
		
		for(int i=2;i<n;i=(int)Math.pow(i, 2)) {
			System.out.println("Hello Wolrd !!!");  //O(log(log(n)))
		}
	}
}
