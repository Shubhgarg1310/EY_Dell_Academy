package com.class2;

abstract class Shape{
	abstract void draw();  //declaration
	
	int length,area,breadth,height,radius;
	double areaofcircle;
	
	static void purpose() {
		System.out.println("Calculate Areas");
	}	
	
}

class Triangle extends Shape{
	
	@Override
	void draw() {
		int breadth = 20,height = 30;
		area = (breadth*height)/2;
		System.out.println(area);
		purpose();
		
	}
	
}

class Ractangle extends Shape{

	@Override
	void draw() {
		int length=20, breadth=10;
		area = length*breadth;
		System.out.println(area);
		
	}
	
}

class Circle extends Shape{

	@Override
	void draw() {
		int radius=10;
		areaofcircle=Math.PI*radius*radius;
		System.out.println(areaofcircle);
		purpose();
		
	}
	
}
public class LetsTestAbstraction {
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.draw();
		Ractangle r = new Ractangle();
		r.draw();
		Circle c = new Circle();
		c.draw();
	}
}
