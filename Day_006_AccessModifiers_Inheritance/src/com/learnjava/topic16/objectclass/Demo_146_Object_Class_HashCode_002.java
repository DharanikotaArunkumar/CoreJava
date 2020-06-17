/*
 * Same objects will have the same hash code .
 * 
 * Objects that are equal must have the same hash code .
 * 
 * 
 */

package com.learnjava.topic16.objectclass;


class Student11{
	
	String name;
}


public class Demo_146_Object_Class_HashCode_002 {

	public static void main(String[] args) {
		Student11 student1 = new Student11();
		student1.name="Vijay";
		
		System.out.println(student1.hashCode());
		
		Student11 student2 = student1;
		
		System.out.println(student2.name);
		System.out.println(student2.hashCode());
		

	}

}
