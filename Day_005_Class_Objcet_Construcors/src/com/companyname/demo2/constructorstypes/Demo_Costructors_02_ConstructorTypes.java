package com.companyname.demo2.constructorstypes;

/*
 * Example of No - Argument  constructor 
 */

class Car1 {

	public String name;
	
	Car1(){
		System.out.println("I am no- arg constutor ."+name);
		System.out.println("i can perform other operations too .Where default constructor can not do");
	}

	public void drive() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_Costructors_02_ConstructorTypes {

	public static void main(String[] args) {

		Car1 audi = new Car1();
		/*audi.name = "audi";
	audi.drive();
*/
	}

}