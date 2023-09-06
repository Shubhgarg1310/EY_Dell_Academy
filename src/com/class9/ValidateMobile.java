package com.class9;

import java.util.regex.Pattern;

public class ValidateMobile {
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd34"));
		System.out.println(Pattern.matches("[7-9]{1}[0-9]{9}","9887846512"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","1887845512"));
		
		System.out.println(Pattern.matches("[a-zA-Z]{5}[0-9]{1}[@]{1}[a-z]{5}[.]{1}[com]{3}", "Shubh1@gmail.com"));
		
		
		//trim function is only used to remove leading and trailing
		//white space in string whereas with replace, you can remove
		//white space from within
		
		String str = "     java    trim   function ";
			System.out.println(str.trim());
	}
}
