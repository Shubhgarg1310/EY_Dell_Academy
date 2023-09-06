package com.class8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample2 {
	public static void main(String[] args) {
		
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("apple");
		shoppingList.add("meggie");
		shoppingList.add("pasta");
		shoppingList.add("milk");
		
		Stream<String> shoppingListStream = shoppingList.stream();
		shoppingListStream.sorted().map(i->i.toUpperCase()).filter(i->i.startsWith("M")).forEach(i->System.out.println(i));
		
		//Now this should throw exception
		shoppingListStream.forEach(i->System.out.println(i));
	}
}
