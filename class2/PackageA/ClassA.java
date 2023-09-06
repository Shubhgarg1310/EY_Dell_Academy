package com.class2.PackageA;


public class ClassA {
	protected int data = 10;
	protected void display() {
		System.out.println(data);
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.display();
	}
}
