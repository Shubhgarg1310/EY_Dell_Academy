package com.class7;

public class DeadlockSituation {
	public static void main(String[] args) {
		
		final String resource1 = "A";
		final String resource2 = "B";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 : locked resource1");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource2) {   //resource 1 is taking resource 2 but how they can do with each other
						System.out.println("Thread1 : Looking for resource 2, looking 1" );
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 : locked resource2");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource1) {
						System.out.println("Thread1 : Looking for resource 1, looking 2" );
					}
				}
			}
		};
		t1.start();
		t2.start();
		}
	}

