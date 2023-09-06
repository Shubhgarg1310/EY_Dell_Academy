package com.class7;

public class YeildAndMinMaxPriority {
	public static void main(String[] args) {
		Thread producerThread = new Producer();
		Thread consumerThread = new Consumer();
	//	producerThread.setPriority(Thread.MAX_PRIORITY);   //max priority is 10
	//	consumerThread.setPriority(Thread.MIN_PRIORITY);  // max priority is 0
		producerThread.start();
		consumerThread.start();
		
	}
}	
class Producer extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Producer Thread " + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Consumer Thread " + i);
			Thread.yield();
		}
	}
}