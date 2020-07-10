package com.companyname.demo2.constructorstypes;
/*
 * parameterized constructors are used to give default values of from the programmer upon creation of object .
 */
class Car7 {

	public String name;
	
	Car7(String carName) {
		name = carName;
		System.out.println("I am Ready ....!!! My name is  :-"+name+ " car");
	}

	public void drive() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_Costructors_07_ConstructorTypes {

	public static void main(String[] args) {

		Car7 audi = new Car7("Audi");
		audi.drive();		
		
	}

}


