package com.companyname.demo3.constructors.thisdemos;

/*
 *  "this " can used to call the another method from a method of a single class .
 * 
 */

class Car3 {

	public  String name;
	
	public float price;
			
	Car3(String name,float price) {
		this.name = name;		
		this.price = price;
		this.drive();
	}

	public void drive() {
		System.out.println("Drving the " + name + " Car....!!!");
		this.changeGear();

	}
	
	public void changeGear() {
		System.out.println("Chaning the Gear ....");

	}

}

public class Demo_Constructors_04_This_KeyWord {

	public static void main(String[] args) {

		Car3 audi = new Car3("Audi",34.56F);
		
		System.out.println(" \n\n calling from main method \n\n ");
		audi.changeGear();
		
		//this.changeGear(); // calling from another class with this 
		
		
			
		
	}
	
	

}