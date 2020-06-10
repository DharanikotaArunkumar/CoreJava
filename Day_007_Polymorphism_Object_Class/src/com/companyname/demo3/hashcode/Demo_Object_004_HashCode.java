/*
 * Hash code must be same even then you fetch n number of times in single run the application .
 * if you run next time hash code may change .
 */

package com.companyname.demo3.hashcode;


class Student3{
	int rollNumber;
	
}
public class Demo_Object_004_HashCode {

	
	public static void main(String[] args){
		Student3 student1 = new Student3();
		System.out.println(student1.hashCode());
					
		student1.rollNumber =1000;
		System.out.println(student1.hashCode());
		
		
	}
	
}
