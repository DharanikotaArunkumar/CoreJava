/*
 * equals method check for if two objects are equal or not .
 */

package com.companyname.demo6.equals;

class Student {

	int studentRollno;
	String studentName;
	float marks;

	public Student(int studentRollno, String studentName, float marks) {
		super();
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.marks = marks;
	}

}

public class Demo_Object_004_Equals {

	public static void main(String[] args) {

	
		Student vijay = new Student(100, "Vijay", 75.45f);

		System.out.println(vijay.equals(vijay));

		Student rajesh = new Student(200, "Rajesh", 75.45f);

		System.out.println(vijay.equals(rajesh));

		rajesh = vijay;
		
		System.out.println(vijay.equals(rajesh));

	}

}
