/*
 * Here we are calling the hash code of the object .Default hash code implementation of native class.
 *  
 */

package com.learnjava.topic16.objectclass;

class Student10 {

	String name;

}

public class Demo_145_Object_Class_HashCode_001 {

	public static void main(String args[]) {

		Student10 vijay = new Student10();
		
		
		
		vijay.name = "vijay";
		
		System.out.println(vijay.hashCode());
		
		System.out.println(new Student10().hashCode());
		
		System.out.println(new Student10().hashCode());
	 
		System.out.println(new Student10().hashCode());
		
		/*Student10 ajay = vijay;
		
		System.out.println(ajay.hashCode());
		

		System.out.println(ajay.name);
		*/
		
	}
}
