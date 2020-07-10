package com.companyname.demo2.constructorstypes;

/*
 * Example of default constructor 
 */

class Car {

	public String name;

	public void drive() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_Costructors_01_ConstructorTypes {

	public static void main(String[] args) {

		Car audi = new Car();
		audi.name = "audi";
		audi.drive();

	}

}
