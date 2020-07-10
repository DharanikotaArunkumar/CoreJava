package com.learnjava.topic14.instanceblock;

/*
 * Instance Block contains the common logic to be executed upon the every object creation .
 */

class CarSold3 {

	

	{
		System.out.println("Temporary registration completed");
	}

	

}

public class Demo_Constructors_04_Initialization_Block {

	public static void main(String[] args) {

		
		CarSold3 audi = new CarSold3();
		System.out.println("\n\n");
		CarSold3 bmw = new CarSold3();
		System.out.println("\n\n");
	
	}
}
