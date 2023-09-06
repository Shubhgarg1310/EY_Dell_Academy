package com.class5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetForBookClass {
	public static void main(String[] args) {
		HashSet<Book> hSet = new HashSet<>();
		Book b1 = new Book(1,"A","V","C",10);
		Book b2 = new Book(2,"S","H","U",20);
		Book b3 = new Book(3,"G","R","G",30);
		
		hSet.add(b1);hSet.add(b2);hSet.add(b3);hSet.add(b1);
		hSet.add(b1);
		Iterator<Book> itr = hSet.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
	}
}
