package com.class5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowComparableAndComparatorWorks {
	public static void main(String[] args) {
		
		int[] intArr = {10,2,82,93};
		Arrays.sort(intArr);
		System.out.println("Sorted Integer array is " + Arrays.toString(intArr));
		
		String[] strArr = {"Z","A","X","B"};
		Arrays.sort(strArr);
		System.out.println("Sorted Integer array is " + Arrays.toString(strArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Z");listStr.add("A");listStr.add("B");listStr.add("X");listStr.add("Z");
		Collections.sort(listStr);
		
		for(String str: listStr) {
			System.out.print(str + " ");
		}
		
	}
}
