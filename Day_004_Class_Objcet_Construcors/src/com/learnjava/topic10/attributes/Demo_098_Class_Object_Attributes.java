/*
 * Instance variables can be accessed only to instances /objects
 */
package com.learnjava.topic10.attributes;

class Dog1 {

	String color; 
	String eyeCOlor;
	float height;
	float weight;
	float length;
}


public class Demo_098_Class_Object_Attributes {

	public static void main(String[] args) {
		Dog1 doberMan = new Dog1();
		doberMan.color ="black";
		System.out.println(doberMan.color);
		

	}

}
