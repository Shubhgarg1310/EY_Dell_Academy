package com.class2;

public class InstanceOf {
	public static void main(String[] args) {
		InstanceOf obj = new InstanceOf();
		System.out.println(obj instanceof InstanceOf);
		obj = null;
		System.out.println(obj instanceof InstanceOf );
	}
}
