package com.class5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForBookClass {
	public static void main(String[] args) {
		ArrayList<Book> arrList = new ArrayList<>();
		
		Book b1 = new Book(1,"A","V","C",10);
		Book b2 = new Book(2,"S","H","U",20);
		Book b3 = new Book(3,"G","R","G",30);
		
		arrList.add(b1);arrList.add(b2);arrList.add(b3);
		arrList.add(b2);arrList.add(b3);arrList.add(b1);
		
		//advance for loop for print
		for(Book b : arrList) {
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
		
		System.out.println();
		//Iterator for print
		Iterator<Book> itr = arrList.iterator();
		while(itr.hasNext()) {               // hasNext gives is there is any object in the list or not
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
	}
	
}
