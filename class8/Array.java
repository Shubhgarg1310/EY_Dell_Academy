package com.class8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Array {
	public static void main(String[] args) {
//		int[] intArr = new int [6];
//		intArr[0] = 10;
//		intArr[1] = 20;
//		
//		for(int i=0;i<intArr.length;i++) {
//			System.out.print(intArr[i] + " ");
//		}
//		System.out.println();
		
	
//		int [] intArr2 = {30,20,15,67,89};
//		for(int i : intArr2) {
//			System.out.println(i + " ");
//		}
//		
//		System.out.println(intArr2);
//	}
		
		Integer[] intArr = new Integer[2];
		intArr[0] = 10;
		intArr[1] = 20;
		
		ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(intArr));  
		
		Iterator<Integer> itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
			
		}
	}
}
