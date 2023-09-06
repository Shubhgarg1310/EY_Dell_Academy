package com.class6;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(123);
		listInt.add(456);
		listInt.add(789);
		printListItems(listInt);
		
		List<Number> listFloat = new ArrayList<Number>();
		listFloat.add(14L);
		listFloat.add(3.14f);
		listFloat.add(21L);
		printListItems(listFloat);
		
		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(11.1D);
		listDouble.add(33.1D);
		//printListItems(listDouble);
		
	}
	
	static void printListItems(List<? super Integer> list) {
		for(Object num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
