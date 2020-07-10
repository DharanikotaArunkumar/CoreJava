/*
 * functional interface still can have object class methods in it ,  But any given time 
 * 
 * there should be only one abstract method functionalInterfaceExample2
 */

package com.learnjava.topic37.functionalinterface;

/*
 * with have having @FunctionalInterface annotation still we can the interface as functional interface .
 * annotation ensure extra compile time check 
 */

@FunctionalInterface
interface FunctionalInterfaceExample3 {
	void method1();
	String toString();
}

public class Demo_Functional_Interface_305_with_Functional_Interface {

	public static void main(String[] args) {

		FunctionalInterfaceExample2 functionalInterfaceExample2 = () -> {
			System.out.println("I am the implementation of functional interface");
		};

		functionalInterfaceExample2.method1();
	}

}
