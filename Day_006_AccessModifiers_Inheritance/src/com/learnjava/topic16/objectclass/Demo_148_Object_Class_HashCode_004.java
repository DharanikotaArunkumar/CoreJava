/*
 * Hash code must be same even then you fetch n number of times in single run the application .
 * if you run next time hash code may change .
 */

package com.learnjava.topic16.objectclass;


class Student13{
	int rollNumber;
	
}
public class Demo_148_Object_Class_HashCode_004 {

	
	public static void main(String[] args){
		Student13 student1 = new Student13();
		System.out.println(student1.hashCode());
					
		student1.rollNumber =1000;
		System.out.println(student1.hashCode());
		
		
	}
	
}
