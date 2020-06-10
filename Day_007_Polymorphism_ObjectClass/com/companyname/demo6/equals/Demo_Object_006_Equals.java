/*
 * If you want to check the object are equal or not based on the values present .
 * 
 * you need to over ride the object class functionality with the that value
 */

package com.companyname.demo6.equals;

class Employee1 {
	int empRollNo;

	public Employee1(int empRollNo) {

		this.empRollNo = empRollNo;
	}

	
	/*
	 * Here we wanted to test equals based on the employee roll number 
	 * 
	 */
	/*@Override
	public boolean equals(Object obj) {
		Employee1 other = (Employee1) obj;
		if (empRollNo == other.empRollNo) {
			return true;
		}
		return false;

	}*/

}

public class Demo_Object_006_Equals {

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
