/*
 *  When we call the toString method .By default it will call the object class to string method .
 */

package com.companyname.demo4.tostring;

class Student {
	String studentName;

}

public class Demo_Object_001_ToString {

	public static void main(String[] args) {

		Student student = new Student();
		
		
		System.out.println("Hash code"+student.hashCode());
		
		//System.out.println("Hex "+Integer.toHexString(student.hashCode()));

		System.out.println(student.toString());
		

		
		
		
		
	}

}
