package com.companyname.demo6.instanceblockdemo;

/*
 * What if multiple instance blocks defined in same class ? Which one will be executed first 
 */

class CarSold7 {

	{
		System.out.println(" Instance block -1 ");

	}

	{
		System.out.println(" Instance block -2 ");

	}
	{
		System.out.println(" Instance block -3 ");

	}

	CarSold7() {
		System.out.println("Constructor");

	}

}

public class Demo_Constructors_07_Initialization_Block {

	public static void main(String[] args) {

		CarSold7 audi = new CarSold7();
	}
}
