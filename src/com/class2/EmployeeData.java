package com.class2;

public class EmployeeData {
	//non static
		int empId;
		String name;
		
		static String orgAddress = "ABC XYZ";
		
		static void orgAddressChange() {
			orgAddress = "MNO PQR";
		}
		
		EmployeeData(int empId, String name){
			this.empId = empId;
			this.name = name;
		}
		
		void display() {
			System.out.println("ID is " + empId + " name is " + name + " Organization Address is " + orgAddress);
		}
		
		public static void main(String[] args) {
			EmployeeData.orgAddressChange();
			EmployeeData e1 = new EmployeeData(123, "Shubham");
			EmployeeData e2 = new EmployeeData(126, "Vipul");
			
			e1.display();
			e2.display();
			
		}
}

