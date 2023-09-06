package com.class5;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private int empAge;
	private int empsalary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	
	Employee(int empId, String empName, int empAge, int empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empsalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "id is " + this.empId + " and name is " + this.empName + " and the age is " + this.empAge + " and the salary is " + this.empsalary;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
		
	}
	
	public static Comparator<Employee> ageComparator = new Comparator<>() {
		public int compare(Employee o1,Employee o2) {
			return o1.getEmpAge() - o2.getEmpAge();
		}
	};
	public static Comparator<Employee> nameComparator = new Comparator<>() {
		public int compare(Employee o1,Employee o2) {
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
	};
	public static Comparator<Employee> salaryComparator = new Comparator<>() {
		public int compare(Employee o1,Employee o2) {
			return o2.getEmpsalary() - o1.getEmpsalary();
		}
	};
}

public class SortingTheObjects {
	public static void  main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(123,"A",25,5000);
		empArr[1] = new Employee(124,"B",24,1000);
		empArr[2] = new Employee(125,"C",23,2000);
		empArr[3] = new Employee(126,"D",22,3000);
		
		Arrays.sort(empArr);
		System.out.println("Sorted emp array is " + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee.ageComparator);
		System.out.println("Sorted emp array(age) is " + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee.nameComparator);
		System.out.println("Sorted emp array(Name) is " + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee.salaryComparator);
		System.out.println("Sorted emp array(Salary) is " + Arrays.toString(empArr));
		
	}
}
