package com.class5;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		
		//10 is initial capacity and 5 is load factor
		Vector<String> vec = new Vector<>(10,5);
		
		vec.addElement("Z");vec.addElement("S");vec.addElement("H");vec.addElement("U");vec.addElement("B");
		vec.addElement("H");vec.addElement("A");vec.addElement("M");vec.addElement("G");vec.addElement("A");
		vec.addElement("Z");
		
		System.out.println("Size of vector is " + vec.size());
		System.out.println("Capacity of vector " + vec.capacity());
		
		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement() + " ");
		}
	}
}
