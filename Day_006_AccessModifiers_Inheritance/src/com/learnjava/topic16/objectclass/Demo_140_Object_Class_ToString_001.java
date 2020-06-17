/*
 *  When we call the toString method .By default it will call the object class to string method .
 */

package com.learnjava.topic16.objectclass;

class Student {
	String studentName;

}

public class Demo_140_Object_Class_ToString_001 {

	public static void main(String[] args) {

		Student student = new Student();
		
		
		System.out.println("Hash code"+student.hashCode());
		
		System.out.println("Hex "+Integer.toHexString(student.hashCode()));

		System.out.println(student);
		
		System.out.println(student.toString());
		
		



		
		
		
		
	}

}
