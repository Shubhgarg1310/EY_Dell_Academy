package com.class7;

import java.util.concurrent.TimeUnit;

public class HowSleepMethodWork extends Thread{
	public static void main(String[] args) {
		
		HowSleepMethodWork t1 = new HowSleepMethodWork();
		HowSleepMethodWork t2 = new HowSleepMethodWork();
		HowSleepMethodWork t3 = new HowSleepMethodWork();
		t1.start();
		t2.start();
		t3.start();
		
		
		//t1.run();       We can't use like this because then it becomes method
	}
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(1000);   //MilliSecond
				TimeUnit.SECONDS.sleep(1);
			}
			catch(InterruptedException e ) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
