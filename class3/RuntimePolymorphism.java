package com.class3;

import com.class2.override;

class Parent2{
	void show() {
		System.out.println("Parent Class Function");
	}
	int data =10;
}

public class RuntimePolymorphism extends Parent2{
	@override
	void show() {
		System.out.println("Child Class Function");
	}
	int data = 20;
	
	void display() {
		//this keyword refers to current class object
		//super keyword refers to immidiate parent class object
		this.show();
		System.out.println(this.data);
		super.show();
		System.out.println(super.data);
	}
	public static void main(String[] args) {
		Parent2 obj = new Parent2(); obj.show();
		System.out.println(obj.data);
		
		RuntimePolymorphism obj2 = new RuntimePolymorphism();
		obj2.show();
		System.out.println(obj2.data);
		
		Parent2 obj3 = new RuntimePolymorphism();
		obj3.show();
		System.out.println(obj3.data);
		
		obj2.display();
	}
}
