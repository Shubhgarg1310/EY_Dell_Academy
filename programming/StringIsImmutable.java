package com.programming;

public class StringIsImmutable {

		public static void main(String[] args) {

		    String str=new String("ABC");

		    System.out.println(str);

		    str.concat("XYZ");

		    str.replace("A", "X");

		    System.out.println(str);

		    

		    

		    //String Buffer

		    StringBuffer br = new StringBuffer("ABC");

		    System.out.println(br);

		    br.append("XYZ");

		    System.out.println(br);

		    

		    //String Builder

		    //String Builder is faster because of the faster synchronisation and came after JDK 1.5

		        StringBuilder br1 = new StringBuilder("ABCDE");

		        System.out.println(br1);

		        br1.append("XYZ");

		        System.out.println(br1);

		}

		}
