package com.learnjava.topic14.instanceblock;

/*
 * Order of execution of instance block
 */

class CarSold2 {

	static int count;
	String carName;

	{
		System.out.println("First :- Instance block will be called ");
		count++;
	}

	CarSold2() {
		System.out.println("Second :- Constructor will be called ");

	}

	CarSold2(String name) {
		carName = name;
		System.out.println("Second :- Constructor will be called ");
	}

}

public class Demo_Constructors_03_Initialization_Block {

	public static void main(String[] args) {

		
		CarSold2 audi = new CarSold2();
		/*System.out.println("\n\n");
		CarSold2 bmw = new CarSold2("bmw");
		System.out.println("\n\n");
		System.out.println("No of Cars Sold " + CarSold2.count);*/
	}
}
