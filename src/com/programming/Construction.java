package com.programming;

public class Construction {
	
	int number;
	//default
//	Construction(){
//		
//	}
	
	//no Arg
	Construction(){
		number = 100;
	}
	// paramitirized 
	
	Construction(int number){
		this.number = number;
	}
	// "This" keyword resolve the ambiguity between non static instance variable and method parameter

	public static void main(String[] args) {
		Construction obj = new Construction();
		System.out.println(obj.number);
		
		Construction obj2 = new Construction(1000);
		System.out.println(obj2.number);
	}
}
