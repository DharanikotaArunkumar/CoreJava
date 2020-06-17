/*
 * equals override should be done properly .
 * 
 * 
 • Reflexive: For any non-null reference value x, x.equals(x) must return true.
 • Symmetric: For any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true. 
 • Transitive: For any non-null reference values x, y, z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) must return true.
 • Consistent: For any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
 • For any non-null reference value x, x.equals(null) must return false.

 * 
 */

package com.learnjava.topic16.objectclass;

class Employee2 {
	int empRollNo;

	public Employee2(int empRollNo) {

		this.empRollNo = empRollNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empRollNo;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee2))
			return false;
		Employee2 other = (Employee2) obj;
		if (empRollNo != other.empRollNo)
			return false;
		return true;
	}

	
	

	
	
}

public class Demo_156_Object_Class_Equals_007 {

	public static void main(String[] args) {

		
		Employee2 employee1 = new Employee2(101); 
		Employee2 employee2 = new Employee2(101);
		Employee2 employee3 = new Employee2(102);
		
		System.out.println(employee1.equals(employee1));
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1.equals(employee3));
		
		
		
		
	}

}
