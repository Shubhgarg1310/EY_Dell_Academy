package com.class3;

public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("Method Main");
		try {
			ExceptionPropagation obj = new ExceptionPropagation();
			obj.a();
		}catch(InterruptedException e) {
			System.out.println("Main Method"+e.getMessage());
		}
	}
	
	void a() throws InterruptedException {
		System.out.println("Method A");
		b();
	}
	
	void b() throws InterruptedException {
		System.out.println("Method B");
		c();
		throw new InterruptedException(" thread Error");
	}
	void c() {
		System.out.println("Method C");
	}
}
