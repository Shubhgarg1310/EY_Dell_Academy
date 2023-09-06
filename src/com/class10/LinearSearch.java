package com.class10;

import java.util.Arrays;

//search a given element in Array
public class LinearSearch {
	public static void main(String[] args) {
		
		int[] intArr = {10,3,7,8,20};
		int lengthOfArray = intArr.length;
		
		int searchElement = 7;
		int index = searchProgram(intArr, lengthOfArray, searchElement);
		if(index == -1) {
			System.out.println("Element " + searchElement + " is not " + " Present in array" + Arrays.toString(intArr));
		}
		else {
			System.out.println("Element " + searchElement + " Found " + " At index " + index);
		}
		}
		
		static int searchProgram(int[] intArr, int length, int element) {
			for(int i=0;i<length;i++) {
				if(intArr[i] == element) {
					return i;
				}
			}
			return -1;
		}
	}

