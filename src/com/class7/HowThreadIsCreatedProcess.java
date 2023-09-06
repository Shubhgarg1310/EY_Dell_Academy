package com.class7;

public class HowThreadIsCreatedProcess extends Thread{
	public static void main(String[] args) {
		
		HowThreadIsCreatedProcess t1 = new HowThreadIsCreatedProcess();
		t1.start();
				
		}
	
	public  void run() {
		System.out.println("I am running automatically");
	}
}