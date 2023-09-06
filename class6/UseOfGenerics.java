package com.class6;

class MyGeneralizedClass<T>{
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}
public class UseOfGenerics {
	public static void main(String[] args) {
	MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
	intType.add(21);
	System.out.println(intType.get());
	intType.add(31);
	//intType.add("ABC");  //Compile Time error will come if I try to add
	//any other data apart from integer
	System.out.println(intType.get());
	
	MyGeneralizedClass<String> strType = new MyGeneralizedClass<>();
	strType.add("Shubham");
	System.out.println(strType.get());
	
	}
}
