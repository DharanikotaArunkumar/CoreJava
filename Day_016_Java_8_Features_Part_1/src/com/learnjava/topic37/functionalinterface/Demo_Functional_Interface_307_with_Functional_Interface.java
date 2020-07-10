/*
 * functional interface still can have default and static methods in it 
 */

package com.learnjava.topic37.functionalinterface;

@FunctionalInterface
interface FunctionalInterfaceExample4 {
	void method1();

	String toString();

	default void defaultMethod() {
		System.out.println(" from default method");
	}
	
	static void staticMethod(){
		System.out.println(" from static method");
	}

}

public class Demo_Functional_Interface_307_with_Functional_Interface {

	public static void main(String[] args) {

		FunctionalInterfaceExample4 functionalInterfaceExample4 = () -> {
			System.out.println("I am the implementation of functional interface");
		};

		functionalInterfaceExample4.method1();
	}

}
