package com.companyname.demo6.instanceblockdemo;

/*
 *  can we call any method before constructor is executed ? lets check .
 */

class CarSold8 {

	{
		System.out.println(" Instance block -1 ");
		display();
	}

	CarSold8() {
		System.out.println(" constructor -1 ");
	}

	void display() {
		System.out.println(" Method -1 ");

	}

}

public class Demo_Constructors_01_staticblock {

	public static void main(String[] args) {

		CarSold8 audi = new CarSold8();

	}
}
