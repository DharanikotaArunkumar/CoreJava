package com.companyname.demo7.staticblockdemo;

/*
 *A class can have any number of static initialization blocks, and they can appear anywhere in the class body. 
 *The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.
 */

class CarSold7 {
	
	static int count; // static variable 
	
	static{

		System.out.println("Static block -1");
	}
	
	{
		System.out.println("Instance block");
	}
	
	CarSold7() {
		System.out.println(" constructor");
	}
	
	static{
		System.out.println("Static block -2");
	}
	
	
	
	
}

public class Demo_Constructors_08_Initialization_Block {

	public static void main(String[] args) {
		
		System.out.println(CarSold7.count);}
}
