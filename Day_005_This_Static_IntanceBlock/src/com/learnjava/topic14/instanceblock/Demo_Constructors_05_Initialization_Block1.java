package com.companyname.demo7.staticblockdemo;

/*
 *  Static block can access only static variable. Why it can access only static variables .
 */

//Static variables and static methods are loaded while class is loading .So those are available to access.
// Non static variables or instance variables memory will be created upon the object creation only .

class CarSold4 {
	
	static int count; // static variable 
	int name; // instance variable
	
	static{
		count++;
	//	name = "john";
		System.out.println("Static block");
	}
	
	{
		System.out.println("Instance block");
	}
	
	CarSold4() {
		System.out.println(" constructor");
	}
	
	
}

public class Demo_Constructors_05_Initialization_Block {

	public static void main(String[] args) {
		
		CarSold4 audi = new CarSold4(); 
		
	}
}
