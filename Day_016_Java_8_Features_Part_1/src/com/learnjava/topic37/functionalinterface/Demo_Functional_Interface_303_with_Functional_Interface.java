/*
 * writing the same method using lamda expression.
 */

package com.learnjava.topic37.functionalinterface;

@FunctionalInterface
interface FunctionalInterfaceExample1 {
	void method1();

}

interface SAMInterface1 extends FunctionalInterfaceExample1{
	
}

public class Demo_Functional_Interface_303_with_Functional_Interface {

	public static void main(String[] args) {

		SAMInterface1 samInterface = () -> {
			System.out.println("I am the implementation of functional interface");
		};

		samInterface.method1();
		
		
		SAMInterface1 myimpl = () -> {
			System.out.println("It my implementation ");
		};

		myimpl.method1();
	}

}
