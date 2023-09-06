package com.class5;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetForBookClass {
	public static void main(String[] args) {
		TreeSet<Book> treeset = new TreeSet<>();
		
		Book b1 = new Book(1,"A","V","C",10);
		Book b2 = new Book(2,"S","H","U",20);
		Book b3 = new Book(3,"G","R","G",30);
		
		treeset.add(b2);treeset.add(b3);treeset.add(b1);treeset.add(b1);
		
		Iterator<Book> itr = treeset.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
}
}
