/*
 * this key word example
 */
package com.learnjava.topic12.constructorstypes;

class Car3 {

	public String name;
	
	Car3(String carName) {
		this.name = carName;
		System.out.println("I am Ready ....!!! My name is  :-"+name+ " car");
	}

	Car3() {
		System.out.println("no arg");
	}

	
	public void drive() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_108_Class_Object_ConstructorsTypes {

	public static void main(String[] args) {

		Car3 audi = new Car3("Audi");
		audi.drive();
		
		
		 
	}

}

