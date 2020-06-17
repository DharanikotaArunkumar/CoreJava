package com.learnjava.topic11.methods;

/*
 * Calling a method
 */


class Vehicle {

	String carName;
	
	void run(){  // Behavior /instance method 
		System.out.println("I am runing "+carName );
	}
}


public class  Demo_100_Class_Object_Methods {
	public static void main(String[] args) {
	
		Vehicle audi =new Vehicle();
		audi.run(); // calling 
		
	}

	
}




