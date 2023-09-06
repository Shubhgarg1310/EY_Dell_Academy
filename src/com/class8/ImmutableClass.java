package com.class8;

public class ImmutableClass {
	public static void main(String[] args) {
		
		String str = new String("ABC");
		System.out.println("After First Step - " + str);
		str = str.concat(" -- XYZ");  //now we made second object
		{
			System.out.println("After Second Step - " + str);
		}
		
		StringBuilder sb = new StringBuilder("ABC");
		System.out.println("SB - After First Step - " + str);
		sb.append(" -- XYZ");
		System.out.println("SB - After Second Step - " + sb);
			
		}
		
	}

