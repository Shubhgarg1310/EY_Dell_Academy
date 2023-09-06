package com.class6;

@FunctionalInterface
interface Circle2{
	double get(double radius);
}
public class AreaCalculation {
	public static void main(String[] args) {
		
		Circle2 circleRadius = (r) -> Math.PI * r * r;
		Circle2 circleCircumfrece = (r) -> 2 * Math.PI * r;
		
		AreaCalculation obj = new AreaCalculation();
		
		double area = obj.circleOperation(10,circleRadius);
		double circumference = obj.circleOperation(20,circleCircumfrece);
		
		System.out.println("Area of Circle is " + area + " and circumference is " + circumference);
	}
	
	public double circleOperation(double radius, Circle2 c) {
		return c.get(radius);
	}
}
