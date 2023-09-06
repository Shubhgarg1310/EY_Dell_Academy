package com.class10;

import java.util.Arrays;

//search given key from multiple elements
//faster in preformance then linear search
public class BinarySearch {
	public static void main(String[] args) {
		
		int[] intArr = {10,3,7,8,20};
		Arrays.sort(intArr);
		System.out.println("Sorted Array is " + Arrays.toString(intArr));
		int lookOutFor = 20;
		int lastElementInArray = intArr.length - 1;
		binarySearch(intArr, 0, lastElementInArray, lookOutFor);
	}
	
	//In binary Search, It is mandatory to sort the element before searching
	static void binarySearch(int[] intArr, int startingPosition, int lastPosition, int searchElement) {
		int midElementPosition = (startingPosition + lastPosition)/2;
		while(startingPosition <= lastPosition) {
			if(intArr[midElementPosition] < searchElement) {
				startingPosition = midElementPosition + 1;
			}
			else if(intArr[midElementPosition] == searchElement) {
				System.out.println("Element " +  searchElement +" Element found at position " + midElementPosition);
				break;
			}
			else {
				lastPosition = midElementPosition-1;
			}
			midElementPosition = (startingPosition + lastPosition)/2;
		}
		if(startingPosition>lastPosition) {
			System.out.println("Element is not found!");
		}
	}
}
