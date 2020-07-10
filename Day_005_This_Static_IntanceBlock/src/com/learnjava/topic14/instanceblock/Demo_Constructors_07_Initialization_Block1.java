package com.companyname.demo7.staticblockdemo;

/*
 *A class can have any number of static initialization blocks, and they can appear anywhere in the class body. 
 *The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.
 */

class CarSold6 {
	
	static int count; // static variable 
	
	static{

		System.out.println("Static block -1");
	}
	
	{
		System.out.println("Instance block");
	}
	
	CarSold6() {
		System.out.println(" constructor");
	}
	
	static{
		System.out.println("Static block -2");
	}

	
	
	
	
	
}

public class Demo_Constructors_07_Initialization_Block {

	public static void main(String[] args) {
		
		System.out.println(CarSold6.count);
		
		CarSold6 carSold6 = new CarSold6();
		CarSold6 carSold1 = new CarSold6();
		
	
	
	}
}
