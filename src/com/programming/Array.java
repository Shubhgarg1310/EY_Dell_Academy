package com.programming;

public class Array {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		String[] strArr = {"A","B","C"};
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
		}
		
	}
}
