/*
 * equals () method of the object class is called .
 * 
 * Object class equals checks only weather its referring to own object or not .
 */

package com.companyname.demo6.equals;

class Student2 {

	int studentRollno;
	String studentName;
	float marks;

	public Student2(int studentRollno, String studentName, float marks) {
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.marks = marks;
	}
}

public class Demo_Object_005_Equals {

	public static void main(String[] args) {

		Student2 vijay = new Student2(100, "Vijay", 75.45f);

		

		System.out.println(" IS Vijay equals to VIjay "+vijay.equals(vijay));
		System.out.println("------------------------------------------------");

		Student2 rajesh = new Student2(200, "Rajesh", 75.45f);

		
		System.out.println("Is Vijay equals to Rajesh :-"+vijay.equals(rajesh));
		System.out.println("-------------------------------------------------");
		rajesh = vijay;
		
		System.out.println("Is Vijay equals to Rajesh :-"+vijay.equals(rajesh));

	}

}
