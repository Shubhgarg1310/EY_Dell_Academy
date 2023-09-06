package com.class3;

public class HandlingMultilpeExceptions {
	public static void main(String[] args) {
		try {
			HandlingMultilpeExceptions obj = new HandlingMultilpeExceptions();
		}
		catch(NullPointerException | ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
