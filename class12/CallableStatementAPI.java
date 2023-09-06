package com.class12;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;



public class CallableStatementAPI {
	static {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Connection conn = null;
		CallableStatement Stmt= null;
		Scanner sc = new Scanner(System.in);

		try {
			String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=Shubham@1";
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
				System.out.println("Connection establised using connection");
			}
			
			
			System.out.println("Enter Employee ID");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee First Name : ");
			String empName = sc.nextLine();
			System.out.println("Enter Employee ROLE : ");
			String empRole = sc.nextLine();
			System.out.println("Enter Employee City : ");
			String empCity = sc.nextLine();
			System.out.println("Enter Employee Country : ");
			String empCountry = sc.nextLine();
			
			Stmt =  conn.prepareCall("{Call insertEmployee(?,?,?,?,?,?)}");  //one for output
			Stmt.setInt(1,id);
			Stmt.setString(2, empName);
			Stmt.setString(3, empRole);
			Stmt.setString(4, empCity);
			Stmt.setString(5, empCountry);
			
			Stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
			
			Stmt.executeUpdate();
			
			String result = Stmt.getString(6);
			
			System.out.println("Employee record Save Sucess : " + result );
			

			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try{
				Stmt.close();
				conn.close();
				sc.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
