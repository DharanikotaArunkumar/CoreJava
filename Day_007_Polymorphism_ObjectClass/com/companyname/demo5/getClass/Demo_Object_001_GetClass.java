/*
 * Get class fetches the information about class name and others .
 */

package com.companyname.demo5.getClass;

import java.lang.reflect.Constructor;

class Student {

	String name;

}

public class Demo_Object_001_GetClass {

	public static void main(String[] args) {

		Student obj = new Student();
		Class class1 = obj.getClass();
		Constructor[] constructors = class1.getConstructors();
		
		
		

		System.out.println(class1);
		System.out.println(class1.isArray());
		System.out.println(class1.isInterface());
		System.out.println(class1.getClassLoader());

		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		display();
		//System.out.println(" Present invoking method name :" + name);

	}
	
	
	public  static void display(){

		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		System.out.println(" Present invoking method name is :" + name);

		
	}

}
