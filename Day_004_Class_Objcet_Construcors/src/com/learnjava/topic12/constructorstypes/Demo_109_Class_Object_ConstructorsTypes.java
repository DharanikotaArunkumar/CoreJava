package com.learnjava.topic12.constructorstypes;
/*
 * A program can contains the more than one constructor . its not thing but constructor over loading .
 */

class Car4 {

	public String name;
	
	
	 Car4() {
			System.out.println("No -aug Constructor called");
		}
	 Car4(String carName) {
		this.name = carName;
		System.out.println("I am Ready ....!!! My name is  :-"+name+ " car");
	}

	

	public void drive() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_109_Class_Object_ConstructorsTypes {

	public static void main(String[] args) {

		Car4 audi = new Car4("Audi");
		audi.drive();
		
		Car4 bmw = new Car4();
		bmw.drive();
		
	}

}