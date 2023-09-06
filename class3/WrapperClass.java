package com.class3;

public class WrapperClass {
	public static void main(String[] args) {
		
		//datatype
		byte grade = 2;
		short marks = 20;
		float price = 8.3f;
		double rate = 240.3D;
		boolean flag = false;
		char initial = 'A';
		
		//Autoboxing - To get a object of data type - Wrapper Class
		Byte bObject = new Byte(grade);
		Short sObject = new Short(marks);
		
		System.out.println("Data Type grade is- " +grade);
		System.out.println("Object BObject is- " + bObject);
		
		
		//Unboxing
		byte byteValue = bObject.byteValue();
		System.out.println(byteValue);
	}
}
