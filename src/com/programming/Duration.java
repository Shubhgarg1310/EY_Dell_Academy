package com.programming;

public class Duration {
	long startValue,endValue;
	
	Duration(long startValue, long endValue){
		if(startValue > endValue) {
			throw new IllegalArgumentException("Start value is never be grater then end value");
		}
		this.startValue = startValue;
		this.endValue = endValue;
	}
	
	long duration() {
		return endValue - startValue;
	}
	
	public static void main(String[] args) {
		Duration obj = new Duration(19,21);
		System.out.println("Duration is " + obj.duration());
	}
}
