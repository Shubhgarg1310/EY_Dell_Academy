package com.class7;
import java.util.Scanner;  // Import the Scanner class
public class reversethestring {
	
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter String");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Original String is: " + userName);  // Output user input
	    
	    StringBuilder input1 = new StringBuilder();
	    input1.append(userName);
	    
        // reverse StringBuilder input1
        input1.reverse();
        
        // print reversed String
        System.out.println("Reverse String is: " + input1);
	  }
	}

