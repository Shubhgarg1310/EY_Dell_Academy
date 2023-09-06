package com.class3;

public class ExceptionalHandling {

	//Unchecked Exception
	public static void main(String[] args) {
//		int data = 10/0;
//		System.out.println(data); //Arithmatic 
		
		ExceptionalHandling obj= new ExceptionalHandling();
		obj=null;
		obj.abc();
	}
	void abc() {
		System.out.println("HI");
	}
}
