package com.class2;

public class EqualMethod {
	public static void main(String[] args) {
		

	String str1 = "String";
	String str2 = "String";
	
	if(str1 == str2) {
		System.out.println(" == works for liberals and constants");
	}
	else {
		System.out.println(" does not work");
	}
	
	//objects
	
	String s3 = new String("String");
	String s4 = new String("String");
	
	if(s3 == s4) {
		System.out.println("== works");
	}
	else {
		System.out.println("Does not works");
	}
	
	
	if(s3.equals(s4)) {
		System.out.println("Equal method works here");
	}
	else {
		System.out.println("does not work");
	}
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
}
}
