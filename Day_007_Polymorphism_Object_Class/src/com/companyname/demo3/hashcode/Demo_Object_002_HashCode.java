/*
 * Same objects will have the same hash code .
 * 
 * Objects that are equal must have the same hash code .
 * 
 * 
 */

package com.companyname.demo3.hashcode;


class Student1{
	
	String name;
}


public class Demo_Object_002_HashCode {

	public static void main(String[] args) {
		Student1 student1 = new Student1();
		student1.name="Vijay";
		
		System.out.println(student1.hashCode());
		
		Student1 student2 = student1;
		
		System.out.println(student2.name);
		System.out.println(student2.hashCode());
		

	}

}
