/*
 * equals method overriding with all fields .
 * 
 * Make sure that fields you want to check in real time .over ride with that primary key filed only
 */

package com.companyname.demo6.equals;

class Employee3 {
	int empRollNo;
	String empName;
	int salary;

	

	public Employee3(int empRollNo) {

		this.empRollNo = empRollNo;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empRollNo;
		result = prime * result + salary;
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
		Employee3 other = (Employee3) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empRollNo != other.empRollNo)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}



	
	
	
	
}

public class Demo_Object_008_Equals {

	public static void main(String[] args) {

		
		Employee3 employee1 = new Employee3(101); 
		Employee3 employee2 = new Employee3(101);
		Employee3 employee3 = new Employee3(102);
		
		System.out.println(employee1.equals(employee1));
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1.equals(employee3));
		
		
		
		
	}

}
