package com.companyname.demo3.constructors.thisdemos;

/*
 * this is a reference to the current object example 2  
 * 
 */

class Car2 {

	public  String name;
	
	public float price;
	
	// name local variable set to this.name 
	// price local variable set to this.price
	
	Car2(String name,float price) {
		this.name = name;		
		this.price = price;
	}

	public void drive() {
		System.out.println("Drving the " + name + " Car....!!!"+price);

	}

}

public class Demo_Constructors_03_This_KeyWord {

	public static void main(String[] args) {

		Car2 audi = new Car2("Audi",34.56F);
		audi.drive();		
		
	}

}