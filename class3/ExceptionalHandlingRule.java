package com.class3;

import java.sql.SQLException;
//for inheritence rule

	class Parent{
		void show() throws SQLException{
			System.out.println("Parent Class Method");
		}
	}
	public class ExceptionalHandlingRule extends Parent{
		
		@Override
		void show() throws Exception{
			System.out.println("child class Method");
		}
		
		public static void main(String[] args) {
			
		}
}