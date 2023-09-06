package com.class9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ALetterWithInWorld {
	private static final String REGEX = "\\bA\\b";
	private static final String INPUT_STRING = "A A A AB A";
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		
		int count = 0;
		
		while(m.find()) {
			count++;
			System.out.println("Match Number - " + count);
			System.out.println("Starting Index - " + m.start());
			//Index or Position or offset after the charecter matches.
			System.out.println("Ending Position " + m.end());
		}
	}
}
