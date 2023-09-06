package com.class9;

import java.util.regex.Pattern;

public class CharacterClassInRegex {
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "a"));  //true
		System.out.println(Pattern.matches("[amn]", "aa")); //False
		System.out.println(Pattern.matches("[amn]", "m"));  //true
		System.out.println(Pattern.matches("[amn]", "mn")); //False
		//any character except a or m or n
		System.out.println(Pattern.matches("[^amn]", "z")); //True
		//any alphabet lowercase or uppercase
		System.out.println(Pattern.matches("[a-zA-Z]", "B")); //True
		//a through d or m through p
		System.out.println(Pattern.matches("[a-d][m-p]", "e"));//false
	}
}
