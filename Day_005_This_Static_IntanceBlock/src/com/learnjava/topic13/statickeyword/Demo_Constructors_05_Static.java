package com.companyname.demo5.staticdemo;

/*
 * 	Static variable will be getting the default values 
 */

class Student{
	
	static int count;
	
	Student(){
		System.out.println("Accessting the  static variable direct  :- "+(++Student.count));
	}
	
		
}


public class Demo_Constructors_05_Static {

	public static void main(String[] args) {
	
		System.out.println(" As static object belongs to class with out creating any object we can accesss static vatiable "+Student.count);
		
		Student.count = Student.count+1;
		
		System.out.println("Accessting the  by using the class name :- "+Student.count);
		

	}

}
