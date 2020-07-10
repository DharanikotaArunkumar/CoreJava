package com.companyname.demo7.staticblockdemo;

/*
 *  can we call static method from static block
 */

class CarSold8 {
	
	{
		System.out.println(" Instance block ");
		
	}

	static{
		System.out.println(" Static block");
		display();
	}

	CarSold8() {
		System.out.println(" constructor");
	}

	public  static void display() {
		System.out.println(" Method");

	}

}

public class Demo_Constructors_09_Initialization_Block {

	public static void main(String[] args) {

		CarSold8 audi = new CarSold8();

	}
}
