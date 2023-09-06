package com.programming;
import java.util.Arrays;

public class ArrayComparision {
	
	public static void main(String[] args) {
		int[] intArr1 = {1,2};
		int[] intArr2 = {1,2};
		
		boolean[] binArr1 = {true,false};
		boolean[] binArr2 = {true,true};
		
		boolean result = Arrays.equals(binArr1,binArr2);
		System.out.println(result);
		boolean result2 = Arrays.equals(intArr1,intArr2);
		System.out.println(result2);
		
		}
	}
