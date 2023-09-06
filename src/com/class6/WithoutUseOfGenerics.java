package com.class6;

import java.util.ArrayList;
import java.util.Iterator;

public class WithoutUseOfGenerics {
	public static void main(String[] args) {
		
		ArrayList arrList = new ArrayList();
		arrList.add("ABC");
		arrList.add(123);
		
		String str = (String) arrList.get(0);
		Integer intData = (Integer)arrList.get(1);
		
		Iterator itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}
}
