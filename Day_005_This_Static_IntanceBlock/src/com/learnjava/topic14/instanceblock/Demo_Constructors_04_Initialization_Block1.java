package com.learnjava.topic14.instanceblock;

/*
 *  Static block executes before the instance block 
 */


class CarSold13 {
	
	static{
		System.out.println("Static block");
	}
	
	{
		System.out.println("Instance block");
	}
	
	CarSold13() {
		System.out.println(" constructor");
	}
	
	
}

public class Demo_Constructors_04_Initialization_Block1 {

	public static void main(String[] args) {
		
		CarSold13 audi = new CarSold13(); 
		
	}
}
