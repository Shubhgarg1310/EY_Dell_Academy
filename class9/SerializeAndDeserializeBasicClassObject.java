package com.class9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class  Employee implements Serializable{
	int empId;
	String empName;
	
	Employee(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
}
public class SerializeAndDeserializeBasicClassObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee emp = new Employee(123, "ABC");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println(emp2.empId + " " + emp2.empName);
		oos.close();
		ois.close();
		
	}
}
