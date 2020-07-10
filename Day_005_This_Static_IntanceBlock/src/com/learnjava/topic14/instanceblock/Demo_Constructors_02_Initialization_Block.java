package com.learnjava.topic14.instanceblock;

class CarSold1 {

	static int count;
	String carName;

	{
		count++;
	}

	CarSold1() {

	}

	CarSold1(String name) {
		carName = name;
	}

}

public class Demo_Constructors_02_Initialization_Block {

	public static void main(String[] args) {

		CarSold1 audi = new CarSold1();
		CarSold1 bmw = new CarSold1("bmw");
		CarSold1 benz = new CarSold1();
		CarSold1 volkswagen = new CarSold1("volkswagen");
		CarSold1 toyota = new CarSold1();
		System.out.println("No of Cars Sold " + CarSold1.count);
	}
}
