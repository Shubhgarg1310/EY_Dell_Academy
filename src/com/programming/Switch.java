package com.programming;

public class Switch {
	public static void main(String[] args) {
		grading('A');
		grading('B');
		grading('C');
		grading('D');
	}
	
	static void grading(char grade) {
		int success = 0;
		
		switch (grade) {
		case 'A':
			success = 1;
			System.out.println("Execellent");
			break;
		case 'B':
		case 'C':
			success=0;
			System.out.println("Good");
			break;
		case 'D':
			success=-1;
			System.out.println("unknown");
		}
		passThecourse(success);
	}
	static void passThecourse(int success) {
		switch(success) {
		case 1:
			System.out.println("Passed");
			break;
		case 0 :
			System.out.println("Can give again");
			break;
		case -1:
			System.out.println("reshadule exam");
			break;
		
		}
	}
}
