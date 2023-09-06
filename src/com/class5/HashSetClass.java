package com.class5;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<>();
		hSet.add("z");hSet.add("z");hSet.add("z");hSet.add("z");
		
		hSet.add(null);hSet.add(null);hSet.add(null);
		
		hSet.add("x");hSet.add("a");hSet.add("b");hSet.add("z");
		
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}
}
