package com.class8;

//super keyword refers to immediate parent class object
class Parent{
	void show() {
		System.out.println("Parent Class Function - show");
	}
	int data = 10;
}
public class SuperKeyword extends Parent{
	@Override
	void show() {
		System.out.println("Child Class Function - show");
	}
	int data =20;
	
	void display() {
		System.out.println("Te value of current class object data is " + this.data);
		System.out.println("The value of immediate class object is " + super.data);
		super.show();
		this.show();
		
	}
	
	public static void main(String[] args) {
		SuperKeyword obj = new SuperKeyword();
		obj.display();
	}
}
