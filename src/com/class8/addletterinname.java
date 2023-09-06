package com.class8;



import java.util.Scanner;

public class addletterinname {

	public static void main(String[] args) {

		addletterinname trimWhiteSpaces = new addletterinname();
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();

		String trimmedMessage = trimWhiteSpaces.trimWhiteSpaces(message);
		System.out.println(trimmedMessage);

	}

	public String trimWhiteSpaces(String message) {
		String S = message.trim();
		return S;
	}

}

