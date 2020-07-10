package com.companyname.demo3.constructors.thisdemos;

/*
 * What is problem with code ...Why its printing null ?
 * 
 */

class Car {

	public String name;
	
	Car(String name) {
		name = name;		
	}

	public void drive() {
		System.out.println("Drving the " + name + " Car....!!!");

	}

}

public class Demo_Constructors_01_This_KeyWord {

	public static void main(String[] args) {

		Car audi = new Car("Audi");
		audi.drive();		
		
	}

}