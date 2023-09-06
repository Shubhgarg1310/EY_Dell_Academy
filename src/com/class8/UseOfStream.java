package com.class8;

import java.util.ArrayList;
import java.util.Collections;

public class UseOfStream {
	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Japan");
		
		Collections.sort(countries);
		for(String country : countries) {
			country = country.toUpperCase();
			if(!country.startsWith("J")) {
				System.out.println("Country name not starting with C --" + country);
			}
		}
		countries.stream().map(s->s.toUpperCase()).
		filter(s-> !s.startsWith("J")).sorted().
		forEach(s -> System.out.println(s)); //Foreach function is terminal
		
		//map gives us new object, don't modified the collection, doesn't use again
		
		countries.stream().forEach(s->System.out.println(s));
	}
}
