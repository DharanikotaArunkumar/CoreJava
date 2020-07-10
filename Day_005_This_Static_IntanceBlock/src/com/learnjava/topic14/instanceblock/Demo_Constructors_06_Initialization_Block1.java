package com.companyname.demo7.staticblockdemo;

/*
 *  Static block can not access the "this keyword ".

 */


// this means current object .before object creation only static block will be executed .

class CarSold5 {
	
	static int count; // static variable 
	int name; // instance variable
	
	static{
		count++;
		//this.name = "john";
		System.out.println("Static block");
	}
	
	
	
	
}

public class Demo_Constructors_06_Initialization_Block {

	public static void main(String[] args) {
		
		System.out.println(CarSold5.count); // Here we are not creating the object of carsold .As we are accessing the count variable
		// car sold class will be loaded and while loading the class static block will be executed .
	}
}
