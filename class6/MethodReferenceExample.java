package com.class6;

public class MethodReferenceExample {
	
	@FunctionalInterface
	public static interface Converter<F,T>{
		T convert (F from);
	}
	
	public static void main(String[] arg) {
		Converter<String, Integer> intConverter = (from) -> Integer.valueOf(from);  //Converter
		Integer convertedValue = intConverter.convert("123");
		System.out.println("Integer Value is " + convertedValue);
		
		//Doing same thing using method Reference
		Converter<String,Integer> intConverter2 = Integer::valueOf;
		Integer convertedValue2 = intConverter2.convert("123");
		System.out.println("Integer Value is " + convertedValue2);
		
		StartingAlphabet obj = new StartingAlphabet();
		Converter<String, String> strCon = obj::startsWith;
		String value = strCon.convert("Java");
		System.out.println(value);
		
		PersonFactor<Person> personObject = Person::new;     //JDK 1.9
		Person person = personObject.create("Core", "java");
		System.out.println("Person name is " + person.firstName + " " + person.lastName);
				
		
	}
	
	static class StartingAlphabet{
		String startsWith(String str) {
			return String.valueOf(str.charAt(1));
		}
	}
	interface PersonFactor<P extends Person>{
		P create(String firstname, String lastName);
	}
}

class Person{
	String firstName;
	String lastName;
	public Person() {}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}