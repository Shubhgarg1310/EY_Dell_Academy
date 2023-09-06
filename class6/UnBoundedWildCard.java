package com.class6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnBoundedWildCard {
	public static void main(String[] args) {
		
		UnBoundedWildCard obj = new UnBoundedWildCard();
		List<String> listStr = new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		
		obj.printCollectionData(listStr);
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(123);
		listInt.add(567);
		obj.printCollectionData(listInt);
	}
	
	void printCollectionData(Collection<?> objToPrint) {
		System.out.println("[");
		for(Object obj : objToPrint) {
			System.out.println(obj.getClass().getCanonicalName() + " : " + obj );
		}
		System.out.println("]");
		System.out.println();
	}
}
