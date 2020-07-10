package com.learnjava.topic14.instanceblock;

class School{
	
	static String schoolName ;
	
	static int regisNo;
	
	static int studentCount;
	
	static Student student;
	
	Teacher teacher;
	
	
	
	
	static {
		schoolName ="ABC School";
		
		regisNo =1232;
		
		studentCount=0;
		
		student = new Student();
		
		
		
		
	}
	
	
}


class Student{
	
	
static String nationallity="india";

	String name;
	int rollNumber;
	
	 Student(){
		System.out.println("Called from student");
	}
	 
	static void displayName(){
		System.out.println(nationallity);
	}
	
}


class Teacher{
	String teacherName;
	String subject;
	
}
public class Test {

	public static void main(String[] args) {
		
		
	/*	// new school is in the market .
		try {
			Class.forName("com.learnjava.topic14.instanceblock.School");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		School school = new School();
		System.out.println(School.schoolName);
		System.out.println(School.regisNo);		
		System.out.println(School.studentCount);
		
	//	school.student =new Student();
		
	}

	
}
