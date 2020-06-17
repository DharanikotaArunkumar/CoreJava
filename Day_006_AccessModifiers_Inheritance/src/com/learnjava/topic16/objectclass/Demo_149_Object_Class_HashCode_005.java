/*
 * A short version

1.Create a int result and assign a non-zero value.

2.For every field f tested in the equals() method, calculate a hash code c by:
If the field f is a boolean: calculate (f ? 0 : 1);
If the field f is a byte, char, short or int: calculate (int)f;
If the field f is a long: calculate (int)(f ^ (f >>> 32));
If the field f is a float: calculate Float.floatToIntBits(f);
If the field f is a double: calculate Double.doubleToLongBits(f) and handle the return value like every long value;
If the field f is an object: Use the result of the hashCode() method or 0 if f == null;
If the field f is an array: see every field as separate element and calculate the hash value in a recursive fashion and combine the values as described next.

3.Combine the hash value c with result:
result = 37 * result + c

4.Return result

*/

package com.learnjava.topic16.objectclass;

class Student4 {
	
	int rollNumber;
	float height;
	char gender;
	boolean physicallyChallen;
	String name;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gender;
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (physicallyChallen ? 1231 : 1237);
		result = prime * result + rollNumber;
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
		Student4 other = (Student4) obj;
		if (gender != other.gender)
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (physicallyChallen != other.physicallyChallen)
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	

	

}

public class Demo_149_Object_Class_HashCode_005 {

	Student4 student1 = new Student4();

	public static void main(String[] args) {

		Student4 student1 = new Student4();
student1.rollNumber=100;
		System.out.println(student1.hashCode());
		
		Student4 student2 = new Student4();
		System.out.println(student2.hashCode());
	}

}
