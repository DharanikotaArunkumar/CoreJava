/*
 * static methods can not be overridden by non static method 
 */
package com.learnjava.topic18.polymorphism;

class SuperClass {

	public static void displayInformation() {
		System.out.println("I am super Static Method");
	}

	public void displayInformationNonStatic() {
		System.out.println("I am super non Static Method");
	}

}

class ChildClass extends SuperClass {

	public static void displayInformation() {
		System.out.println("I am child static  Method");
	}

	@Override
	public void displayInformationNonStatic() {
		System.out.println("I am child non Static Method");
	}
}

public class Demo_Polymorphism_05 {

	public static void main(String[] args) throws ClassNotFoundException {


		SuperClass superClass = new SuperClass();
		superClass.displayInformation();
		superClass.displayInformationNonStatic();

		ChildClass childClass = new ChildClass();
		
		 childClass.displayInformation();
		 childClass.displayInformationNonStatic();
		 

		superClass = childClass;

		superClass.displayInformationNonStatic(); // to whom your refering is
		
		superClass.displayInformation(); // to whom your assigned matter
													// matters

	}

}
