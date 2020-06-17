/*
 * When you try to print the object i system out or any logger ,it calls the tostring method .
 */

package com.learnjava.topic16.objectclass;

class Student1{
	String studentName;
}

public class Demo_141_Object_Class_ToString_002 {
	
	
	public static void main(String[] args){
	
		Student student= new Student();
		System.out.println(student);
		
	}
	

}
