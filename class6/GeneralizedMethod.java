package com.class6;

public class GeneralizedMethod {
	public static void main(String[] args) {
		
		Integer[] intArr = {10,4,5,3,5,6,8,23};
		String[] strArr = {"Z","A","X","B","W"};
		
		System.out.println("Printing Integer Array");
		printArray(intArr);
		
		System.out.println("Printing String Array");
		printArray(strArr);
	}
	
	static<E> void printArray(E[] element) {
		for(E ele: element) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
}
