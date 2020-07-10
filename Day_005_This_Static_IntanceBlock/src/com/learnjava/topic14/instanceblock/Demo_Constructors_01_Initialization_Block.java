package com.companyname.demo6.instanceblockdemo;

/*
 * How to find the no of car sold from the show room .
 */

class CarSold {

	static int count;
	String carName;

	CarSold() {
		count++;
	}

	CarSold(String name) {
		carName = name;
	}

}

public class Demo_Constructors_01_Initialization_Block {

	public static void main(String[] args) {

		CarSold audi = new CarSold();
		CarSold bmw = new CarSold("bmw");
		CarSold benz = new CarSold();
		CarSold volkswagen = new CarSold("volkswagen");
		CarSold toyota = new CarSold();
		System.out.println("No of Cars Sold " + CarSold.count);
	}
}
