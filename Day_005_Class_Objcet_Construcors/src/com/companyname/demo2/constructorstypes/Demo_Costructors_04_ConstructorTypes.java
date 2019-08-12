package com.companyname.demo2.constructorstypes;

class Car3 {

	public String name;
	
	Car3(String carName) {
		name = carName;
		System.out.println("I am Ready ....!!! My name is  :-"+name+ " car");
	}

	Car3() {
		System.out.println("no arg");
	}

	
	public void drive() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_Costructors_04_ConstructorTypes {

	public static void main(String[] args) {

		Car3 audi = new Car3("Audi");
		audi.drive();
		
		/*
		 * Does below method creates any error and why if it is ?
		 */
		Car3 bmw = new Car3();
		bmw.drive();
		 
	}

}

