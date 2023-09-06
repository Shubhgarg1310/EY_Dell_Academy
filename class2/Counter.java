package com.class2;

public class Counter {
	static int count;  //If we remove static it gives 1,1,1 that is rule 1 of static variable
	Counter(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}

}