package com.programming;

public class EY_Employee {
	//attributes
	int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	String empName;
	double salary;
	String empDesignation;
	
	public static void main(String[] args)
	{
		EY_Employee emp = new EY_Employee();
		emp.setEmpid(1);
		emp.setEmpName("Shubham");
		emp.setSalary(30000);
		emp.setEmpDesignation("Senior Analyst");
		
		
		System.out.println("ID is " + emp.getEmpid() );
		System.out.println("Name is " + emp.getEmpName() );
		System.out.println("Salary is " + emp.getSalary() );
		System.out.println("Designation is " + emp.getEmpDesignation() );
		
	}
	
}
