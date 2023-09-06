package com.class2;

public class PersonData implements Cloneable {
	//non static or INSTANCE VARIABLE
	
	int person_id;
	String name;
	
	PersonData(int person_id, String name){
		this.person_id = person_id;
		this.name = name;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		PersonData obj1 = new PersonData(123,"ABC");
		PersonData obj2 = (PersonData) obj1.clone();
		
		System.out.println(obj1.name + " " + obj1.person_id);
		System.out.println(obj2.name + " " + obj2.person_id);
	}
	
}
