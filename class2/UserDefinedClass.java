package com.class2;

import java.util.Objects;

class Employee{
	String Name;

	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Name, other.Name);
	}
}
public class UserDefinedClass {
		public static void main(String[] args) {
			Employee e1 = new Employee();
			Employee e2 = new Employee();
			
			e1.setName("ABC");
			e2.setName("ABC");
			
			if(e1.equals(e2)) {
				System.out.println("Works for Custom Class");
			}
			else {
				System.out.println("not work");
			}
			System.out.println("Memory Address " + e1.hashCode());
			System.out.println("Memory Address " + e2.hashCode());
		}
}
