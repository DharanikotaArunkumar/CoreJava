/*
 * With to string method over ride .
 */
package com.companyname.demo4.tostring;

class Student2 {

	int studentRollno;
	String studentName;
	float marks;

	public Student2(int studentRollno, String studentName, float marks) {
		super();
		this.studentRollno = studentRollno;
		this.studentName = studentName;
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return "Student2 [studentRollnooooooooooo=" + studentRollno + ", studentName=" + studentName + ", marks=" + marks + "]";
	}

	
	

	

}

public class Demo_Object_003_ToString {

	public static void main(String[] args) {
		
		
		int count =10;
		System.out.println(count);

		Student2 student = new Student2(100, "Vijay", 78.45f);

		System.out.println(student); // With to string and with to string over ride .

	}

}
