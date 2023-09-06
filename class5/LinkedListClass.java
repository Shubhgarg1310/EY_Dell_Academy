package com.class5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
        list.add("A");list.add("A");list.add("A");list.add("A");
        list.add(null);list.add(null);list.add(null);
        list.add("z");list.add("y");list.add("x");
        
        list.addFirst("FIRST");
        list.addLast("Last");
        
        Object firstElement = list.getFirst();
        System.out.println("FirstElement is " + firstElement);
        
        Object lastElement = list.getLast();
        System.out.println("lastElement is " + lastElement);
        
        Object allElement = list.get(8);
        System.out.println(allElement);
        
        int position = list.indexOf(null);
        System.out.println("position of null is " + position);
        
        int lastPositionOfA = list.lastIndexOf("A");
        System.out.println("position of last A is  " + lastPositionOfA);
        
        list.add(0, "Added Element");
        list.remove(2); //removed element from second index
        
        //list.removeFirst();
        list.removeLast();
        
        list.removeFirstOccurrence("A");
        list.removeLastOccurrence("A");
        
        Object o = list.poll();   //return and remove first item from the list
        Object o2 = list.pollLast(); //return and remove Last item from the list
        list.add("hello world");
        
        
        
        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext()) {
       	System.out.println(itr.next() + " ");
       }
        
       System.out.println("Previous"); 
          while(itr.hasPrevious()) {
        	  System.out.println(itr.previous() + " ");
          }
          
        }

}