package com.class2;

class Machine{
	void start() {
		System.out.println("Machine Started");
	}
	
	void stop() {
		System.out.println("Machine Stop");
	}
}

class Camera extends Machine{
	@override
	void start() {
		System.out.println("camera is started");
	}
	
	void snap() {
		System.out.println("Photo clicked");
	}
}

public class TypeCasting {
	
	public static void main(String[] args) {
		
		Machine m = new Machine();
		m.start();
		m.stop();
		
		Camera c = new Camera();
		c.start();
		c.snap();
		c.stop();
		
		Machine m1 = new Camera(); //Upcasting autometically
		m1.start();
		m1.stop();
		
		Machine m2 = c; // Upcasting
		m2.start();
		m2.stop();
		
		//Downcasting
		
		Machine m3 = new Camera();
		Camera c2 = (Camera)m3;//downcasting
		c2.start();
		c2.stop();
		c2.snap();
	}

}
