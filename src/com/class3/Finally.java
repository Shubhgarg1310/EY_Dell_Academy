package com.class3;

public class Finally {
	//finally will always work
	public static void main(String[] args) {
		int result = sampleMethod();
		System.out.println(result);
	}
	static int sampleMethod() {
		try {
			return 123;
		}
		finally {
			System.out.println("code is running");
		}
	}
}
