package com.class2;
@FunctinalInterface
interface SomeData {
	void  fullName(String FirstName, String LastName);

}

   public class Functional implements SomeData{
   @Override
   public void fullName(String FirstName, String LastName) {
   	System.out.println("name is " + FirstName + " " + LastName);
   	
   }
   public static void main(String[] arg) {
	   Functional obj = new Functional();
	   obj.fullName("ABC", "DEF");
   }

}