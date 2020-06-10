/*
 * How to override hash code ?
 * 
 */


package com.companyname.demo3.hashcode;



class Student2{
	int rollNumber;
	
	String  name;

	
	public Student2(int rollNumber) {
		super();
		this.rollNumber = rollNumber;
	}



	@Override
	public int hashCode() {		
		return rollNumber;
	}
	
		
	
}

public class Demo_Object_003_HashCode {

	public static void main(String[] args) {
		
		Student2 vijay = new Student2(100);

		System.out.println(vijay.hashCode()); // Here overridden hash code will be called .
		
		Student2 Ajay = new Student2(200);
		
		System.out.println(Ajay.hashCode()); // Here overridden hash code will be called .
		
	}

}
