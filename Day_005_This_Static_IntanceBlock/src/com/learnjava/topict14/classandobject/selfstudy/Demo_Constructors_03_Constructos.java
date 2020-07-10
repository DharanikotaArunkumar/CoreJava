package com.companyname.demo4.constructorscontinues;

class Student{
	
	String name;
	String course ;
	
	Student(){
		
	}
	
	Student(String stName, String stCourse){
		name = stName;
		course = stCourse;		
	}
	
	void studentInformation(){
		System.out.println("name :- "+name+" Course :- "+course);

	}
}

public class Demo_Constructors_03_Constructos {

	public static void main(String[] args) {
		Student student1 = new Student("Ram" ,"AeroSpace Analytics");
		student1.studentInformation();
		
		Student student2 = student1;
		student2.studentInformation();
		
		Student student3 = student2;
		student3.studentInformation();
		
		
		
	
		
	}

}