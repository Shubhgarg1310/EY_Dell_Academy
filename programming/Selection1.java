package com.programming;

public class Selection1 {
	public static void main(String[] args) {
		int marks = 95;
		if(marks < 100 && marks > 90) {
			System.out.println("Good marks " + marks);
		}
		else {
			System.out.println("Unknown Marks");
		}
		
		
		int number = 15;
		
		if(number % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
