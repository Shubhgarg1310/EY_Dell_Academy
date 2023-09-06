package com.class5;

import java.util.Hashtable;
import java.util.Map;

public class HashTableClass {
public static void main(String[] args) {
		
		Hashtable<Integer, Book> hMap = new Hashtable<>();
		
		Book b1 = new Book(1,"A","V","C",10);
		Book b2 = new Book(2,"S","H","U",20);
		Book b3 = new Book(3,"G","R","G",30);
		
		hMap.put(123, b3);
		hMap.put(127, b2);
		hMap.put(129, b3);
		
		for(Map.Entry<Integer, Book> m: hMap.entrySet()) {
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println("Key " + key + " details are : ");
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
		
	}
}
