/*
 * If you want to check the object are equal or not based on the values present .
 * 
 * you need to over ride the object class functionality with the that value
 */

package com.learnjava.topic16.objectclass;

class Employee1 {
	int empRollNo;

	public Employee1(int empRollNo) {

		this.empRollNo = empRollNo;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empRollNo;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (empRollNo != other.empRollNo)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee1 [empRollNo=" + empRollNo + "]";
	}

	
	
}

public class Demo_155_Object_Class_Equals_006 {

	public static void main(String[] args) {

		
		Employee1 employee1 = new Employee1(101); 
		Employee1 employee2 = new Employee1(101);
		Employee1 employee3 = new Employee1(102);
		
		System.out.println(employee1.equals(employee1));
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1.equals(employee3));
		
		System.out.println(employee1==employee1);
		
		System.out.println(employee1 == employee2);
		
		
		
		
	}

}
