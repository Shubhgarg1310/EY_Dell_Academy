package com.class7;

class SharedResource{
	synchronized static void print(int n) {   //synchronized method
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(i);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	public void run() {
		SharedResource.print(5);
	}
}

class MyThread2 extends Thread{

	public void run() {
		SharedResource.print(10);
	}
}
public class CodeWithoutSynchronization {
	public static void main(String[] args) {
	//	SharedResource obj = new SharedResource();
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
	
		t1.start();
		t2.start();
		
	}
}
