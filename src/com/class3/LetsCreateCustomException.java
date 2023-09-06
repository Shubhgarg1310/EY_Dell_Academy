package com.class3;

import java.io.Serializable;

class InvalidAgeException extends Exception implements Serializable{
	
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String message){
		super(message);
	}
}

public class LetsCreateCustomException {
	public static void main(String[] args) {
		try {
			validVoterStatus(17);
		} catch (InvalidAgeException e) {
			System.out.println("Exception message " + e.getMessage());
		}
		System.out.println("run the code...");
	}
	
	static void validVoterStatus(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("User can't vote");
		}
	}
}
