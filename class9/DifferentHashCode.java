package com.class9;

public class DifferentHashCode {
	public static void main(String[] args) {
		
		DifferentHashCode obj = new DifferentHashCode();
		System.out.println(obj.hashCode());
		
		DifferentHashCode obj2 = new DifferentHashCode();
		System.out.println(obj2.hashCode());
	}
}
