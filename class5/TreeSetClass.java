package com.class5;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		TreeSet<String> hSet = new TreeSet<>();
		hSet.add("z");hSet.add("z");hSet.add("z");hSet.add("z");
		
		//hSet.add(null);hSet.add(null);hSet.add(null);
		
		hSet.add("x");hSet.add("a");hSet.add("b");hSet.add("z");
		
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}
}
