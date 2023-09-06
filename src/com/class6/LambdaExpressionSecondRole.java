package com.class6;

@FunctionalInterface
interface isFunctional{
	void show(String data);
}
public class LambdaExpressionSecondRole {
	public static void main(String[] args) {
		isFunctional obj = new isFunctional() {

			@Override
			public void show(String data) {
				System.out.println("Using Anonymous Inner " + data);
				
			}
			
		};
		obj.show(" Class way of implementation");
		
		isFunctional obj2 = (demoData) -> {System.out.println("Eliminating Anonymous Inner" + demoData);
	};
	obj2.show(" Class way of implementation - through lambda Expression" );
}
}