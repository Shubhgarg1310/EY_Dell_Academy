package com.programming;
import java.util.Arrays;
public class CopyArray {
	
	public static void main(String[] args) {
		char[] arr1 = {'z','a','d','t','u','o'};
		char[] arr2 = new char[3];
		
		System.arraycopy(arr1, 1, arr2, 0, 3);
		System.out.println(Arrays.toString(arr2));
		System.out.println(new String(arr2));
		
	}

}