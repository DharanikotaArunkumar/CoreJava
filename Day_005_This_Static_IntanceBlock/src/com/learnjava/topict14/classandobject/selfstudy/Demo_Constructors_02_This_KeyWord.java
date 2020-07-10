package com.companyname.demo3.constructors.thisdemos;

/*
 * this is a reference to the current object 
 * 
 */

class Car1 {

	public String name;
	
	// Here this mean the current object . What is current object ....its audi
	Car1(String name) {
		this.name = name;		
	}

	public void drive() {
		System.out.println("Drving the " + name + " Car....!!!");

	}

}

public class Demo_Constructors_02_This_KeyWord {

	public static void main(String[] args) {

		Car1 audi = new Car1("Audi");
		audi.drive();		
		
	}

}