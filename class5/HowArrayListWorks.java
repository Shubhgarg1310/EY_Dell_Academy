package com.class5;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		//Duplicate is allowed
		arrList.add("A");arrList.add("A");arrList.add("A");arrList.add("A");
		
		//null is allowed
		arrList.add(null);arrList.add(null);arrList.add(null);
		
		
		arrList.add("z");arrList.add("y");arrList.add("x");
		
		
		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("F"); arrList2.add("I"); arrList2.add("R"); arrList2.add("S"); arrList2.add("T");
		//Adding second arrayList in first arrayList
		arrList.addAll(arrList2);
		
		//Size of arrayList
		System.out.println("Size of the list is " + arrList.size());
		
		//removing first A
		arrList.remove("A");
		System.out.println("Size of the list is " + arrList.size());
		
		
		//removing second arrayList from first arrayList
		
		arrList.removeAll(arrList2);
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		//Updating the element at first index in the arrayList
		arrList.set(1,"Update");
		
		//removing all element from first arrayList and keeping all element of second arrayList
		arrList.retainAll(arrList2);
		
		//clear the whole arrList
		arrList.clear();
		
		
	}
}
