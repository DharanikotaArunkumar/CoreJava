/*
 * Java provides a new feature called method reference in Java 8.
 * Method reference is used to refer method of functional interface.
 * 
 *  Advantages :- It is compact and easy form of lambda expression.
 *  Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.
 */

package com.learnjava.topic45.methodreferences;

interface VehicleInterface {
	Vehicle getVehicle(String name, int cubicCapacity);
}

class Vehicle {

	private String name;

	private int cubicCapacity;

	public Vehicle(String name, int cubicCapacity) {
		super();
		this.name = name;
		this.cubicCapacity = cubicCapacity;
	}

	

}

public class Demo_MethodReferences_001_Constructor {

	public static void main(String[] args) {

		VehicleInterface car = Vehicle::new; 

		car.getVehicle("audi", 2000);
		
		

	}

}
