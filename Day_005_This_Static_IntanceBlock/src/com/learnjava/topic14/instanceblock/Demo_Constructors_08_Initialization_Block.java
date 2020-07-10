package com.companyname.demo6.instanceblockdemo;

import java.util.Calendar;
import java.util.Date;

/*
 *  We can have the instance blocks any where in the programs .
 */

class CarSold6 {

	String name;
	static int count;

	{

		System.out.println(" Instance block -1 ");
	}

	CarSold6(String carName) {
		name = carName;
		System.out.println(" constructor -1 ");

	}

	{
		System.out.println(" Instance block -2 ");

	}

	CarSold6() {
		System.out.println(" constructor -2 ");
	}

	{
		System.out.println(" Instance block -3 ");
		
	}
	
	

}

public class Demo_Constructors_08_Initialization_Block {
	
	public static void main(String[] args) {

		CarSold6 audi = new CarSold6();
		System.out.println("\n\n");
		CarSold6 bmw = new CarSold6("audi");
		System.out.println("\n\n");

	}
}
