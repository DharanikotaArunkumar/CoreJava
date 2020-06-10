/*
 * If should always write to String method with string builder for complex objects.
 */

package com.companyname.demo4.tostring;

class Student3 {

	int studentRollno;
	String studentName;
	float marks;

	public Student3(int studentRollno, String studentName, float marks) {
		super();
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return "Student3 [studentRollno=" + studentRollno + ", studentName=" + studentName + ", marks=" + marks + "]";
	}

	
	
	
	
}

public class Demo_Object_004_ToString {

	public static void main(String[] args) {
		Student3 student = new Student3(100, "Vijay", 78.45f);

		System.out.println(student); 


	}

}
