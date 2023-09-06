package com.class3;

import java.io.IOException;

public class ThrowKeyword {
	public static void main(String[] args) {
		sampleMethod();
		System.out.println("rest of code...");
	}
	
	static void sampleMethod() {
		try {
			throw new IOException("Device Error");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Exceptional Handled " + e.getMessage());
		}
		
		
	}
}
