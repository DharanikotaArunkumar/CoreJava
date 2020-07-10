package com.companyname.demo3.constructors.thisdemos;

/*
 *  "this " can used to call the another method from a method of a single class .
 *  Compiler will add the "this" while calling method exist in same class .
 * 
 */

class Car4 {

	public String name;

	public float price;

	Car4(String name, float price) {
		this.name = name;
		this.price = price;
		drive(); // here compiler will add the this keyword
		//this.drive()
	}

	public void drive() {
		System.out.println("Drving the " + name + " Car....!!!");
		changeGear();   // here compiler will add the this keyword result will be  :- this.changeGear();
	}

	public void changeGear() {
		System.out.println("Chaning the Gear ....");
	}

}

public class Demo_Constructors_05_This_KeyWord {

	public static void main(String[] args) {

		Car4 audi = new Car4("Audi", 34.56F);
		audi.drive();

	}

}