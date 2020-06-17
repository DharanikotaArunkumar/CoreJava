/*
 * what is the problems with "==" when it comes to checking equality . 
 */
package com.learnjava.topic16.objectclass;

class Employee {

	String empNumber;

	public Employee(String empNumber) {
		this.empNumber = empNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empNumber == null) ? 0 : empNumber.hashCode());
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
		Employee other = (Employee) obj;
		if (empNumber == null) {
			if (other.empNumber != null)
				return false;
		} else if (!empNumber.equals(other.empNumber))
			return false;
		return true;
	}

	
	

}

public class Demo_152_Object_Class_Equals_003 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("101");

		Employee emp2 = new Employee("101");

		// By using the "==" i can not check both are of same employee based on empnumber.
		System.out.println(emp1 == emp2); 
		
		System.out.println(emp1.equals(emp2));

	}

}
