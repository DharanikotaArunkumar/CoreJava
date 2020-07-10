package com.learnjava.topic14.instanceblock;

/*
 *  Static block executes on class is loaded.
 */


class CarSold11 {
	
	static{
		System.out.println(" Static block from car sold");
	}
	
}

public class Demo_Constructors_03_Initialization_Block1 {

	static {
		System.out.println(" Static block from demo constructor");
	}

	public static void main(String[] args) {
		
		CarSold11 audi = new CarSold11(); // if this line is commented car sold class will called .
		//if that class is not called then it wont load the class . 
		
	}
}
