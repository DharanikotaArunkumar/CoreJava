/*
 * Get class fetches the information about class name and others .
 */

package com.learnjava.topic16.objectclass;

import java.lang.reflect.Constructor;
import java.util.Arrays;
class Student8 {

	String name;
	
	public Student8(){
		System.out.println("cons");
	}
	
	public Student8(String name){
		System.out.println("cons");
	}


}

public class Demo_159_Object_Class_GetClass {
	
	

	public static void main(String[] args) {
		
		


		Student8 vijay = new Student8();
		Class class1 = vijay.getClass();
		Constructor[] constructors = class1.getConstructors();
		
		for(Constructor con:constructors){
			System.out.println("constru"+con);
		}
		

		System.out.println(class1);
		System.out.println(class1.isArray());
		System.out.println(class1.isInterface());
		
		System.out.println(class1.isAnnotation());

		System.out.println(class1.isLocalClass());
	
		System.out.println(class1.getSimpleName());
		System.out.println(Arrays.toString(class1.getDeclaredFields()));

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
