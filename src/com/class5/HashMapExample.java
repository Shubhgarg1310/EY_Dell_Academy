package com.class5;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hMap = new HashMap<>();
		hMap.put(123, "ABC");
		hMap.put(123, null); //second record with same key will override first record
		hMap.put(121, null);
		hMap.put(null, "PQR");
		hMap.put(null, "XYZ");
		hMap.put(135, "PQR");
		
		//remove key
		hMap.remove(135);
		//This is how we traverse Map
		for(Map.Entry<Integer, String> m : hMap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}
}
