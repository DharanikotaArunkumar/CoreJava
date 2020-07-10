package com.companyname.demo7.staticblockdemo;

/*
 * 	The static initializer only runs once when the class is loaded.
 *  The constructor  and instance block is called for each object of that type you instantiate.
 */

class CarSold9 {
	
	{
		System.out.println(" Instance block ");
		
	}

	static{
		System.out.println(" Static block");
		
	}

	CarSold9() {
		System.out.println(" constructor");
	}


}

public class Demo_Constructors_10_Initialization_Block {

	public static void main(String[] args) {

		CarSold9 audi = new CarSold9();
		System.out.println("-------------");
		CarSold9 bmw = new CarSold9();
		System.out.println("-------------");
		CarSold9 benz = new CarSold9();

	}
}
