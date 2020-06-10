/*
 * Here we are calling the hash code of the object .Default hash code implementation of native class.
 *  
 */

package com.companyname.demo3.hashcode;

class Student {

	String name;

}

public class Demo_Object_001_HashCode {

	public static void main(String args[]) {

		Student vijay = new Student();
		
		
		
		vijay.name = "vijay";
		
		System.out.println(vijay.hashCode());
		
		System.out.println(new Student().hashCode());
		
		System.out.println(new Student().hashCode());
	 
		System.out.println(new Student().hashCode());
		
		Student ajay = vijay;
		
	System.out.println(ajay.hashCode());
		

		System.out.println(ajay.name);
		
		
	}
}
