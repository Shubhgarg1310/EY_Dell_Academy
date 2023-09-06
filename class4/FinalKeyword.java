package com.class4;

public final class FinalKeyword {
	final static String PAN_CARD_NUMBER;
	FinalKeyword(){
		PAN_CARD_NUMBER = "HJSSHHJ656G";
	}
	
	static {
		PAN_CARD_NUMBER = "HVHVHG67G";
	}
	
	final void display() {
		System.out.println("Final Method");
	}
	
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.PAN_CARD_NUMBER);
	}
}
