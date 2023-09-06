package com.class3;

public class TryWithResourcesWithAutoCloseable {
	public static void main(String[] args) {
		try {
			tryWithResource();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception thrown is " + e.getMessage());
		}
		
		
		//tryWithoutResource();
		
		
	}
	
	static void tryWithResource() throws Exception {      //HelpToProgrammer to find the resource
		try(MyResource mr = new MyResource()){
			System.out.println("I am in try with resource method");
			if(true) {
				throw new Exception("Exception thrown from try with resource");
			}
		}
	}
	
	static class MyResource implements AutoCloseable{  //InnerClass

		@Override
		public void close() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Close will be called automatically");
			
		}
		
	}
}
