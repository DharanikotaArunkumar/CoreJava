/*
 * How to override hash code ?
 * 
 */


package com.learnjava.topic16.objectclass;



class Student12{
	int rollNumber;
	
	String  name;

	
	public Student12(int rollNumber) {
		super();
		this.rollNumber = rollNumber;
	}



	@Override
	public int hashCode() {		
		return rollNumber;
	}
	
		
	
}

public class Demo_147_Object_Class_HashCode_003 {

	public static void main(String[] args) {
		
		Student12 vijay = new Student12(100);

		System.out.println(vijay.hashCode()); // Here overridden hash code will be called .
		
		Student12 Ajay = new Student12(200);
		
		System.out.println(Ajay.hashCode()); // Here overridden hash code will be called .
		
	}

}
