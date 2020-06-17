/*
 * equals method check for if two objects are equal or not .
 */

package com.learnjava.topic16.objectclass;

class Student14 {

	int studentRollno;
	String studentName;
	float marks;

	public Student14(int studentRollno, String studentName, float marks) {
		super();
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.marks = marks;
	}

}

public class Demo_153_Object_Class_Equals_004 {

	public static void main(String[] args) {

	
		Student14 vijay = new Student14(100, "Vijay", 75.45f);

		System.out.println(vijay.equals(vijay)); //vijay ==vijay

		Student14 rajesh = new Student14(200, "Rajesh", 75.45f);

		System.out.println(vijay.equals(rajesh));  // vijay == rajesh

		rajesh = vijay;
		
		System.out.println(vijay.equals(rajesh));

	}

}
