/*
 * equals () method of the object class is called .
 * 
 * Object class equals checks only weather its referring to own object or not .
 */

package com.learnjava.topic16.objectclass;

class Student9 {

	int studentRollno;
	String studentName;
	float marks;

	public Student9(int studentRollno, String studentName, float marks) {
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.marks = marks;
	}
}

public class Demo_154_Object_Class_Equals_005 {

	public static void main(String[] args) {

		Student9 vijay = new Student9(100, "Vijay", 75.45f);

		

		System.out.println(" IS Vijay equals to VIjay "+vijay.equals(vijay));
		System.out.println("------------------------------------------------");

		Student9 rajesh = new Student9(200, "Rajesh", 75.45f);

		
		System.out.println("Is Vijay equals to Rajesh :-"+vijay.equals(rajesh));
		System.out.println("-------------------------------------------------");
		rajesh = vijay;
		
		System.out.println("Is Vijay equals to Rajesh :-"+vijay.equals(rajesh));

	}

}
