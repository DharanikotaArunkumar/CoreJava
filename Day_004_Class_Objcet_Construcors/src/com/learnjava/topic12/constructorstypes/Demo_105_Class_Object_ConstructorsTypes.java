package com.learnjava.topic12.constructorstypes;

/*
 * Example of default constructor 
 */

class Car {

	public String name;

	
	
	
	public void drive() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_105_Class_Object_ConstructorsTypes {

	public static void main(String[] args) {

		Car audi = new Car();
		
		System.out.println(" Car Name "+audi.name);
		

	}

}
