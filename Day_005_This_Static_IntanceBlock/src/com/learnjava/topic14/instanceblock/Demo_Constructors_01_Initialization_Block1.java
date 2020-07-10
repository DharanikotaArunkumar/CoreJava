package com.learnjava.topic14.instanceblock;

/*
 *  Static block example
 */

class CarSold10{
	
	int carprice ;
	
	static {
		System.out.println(" static block");
	}
	
	CarSold10() {
		System.out.println(" constructor");
	}

}

public class Demo_Constructors_01_Initialization_Block1 {
	
	public static void main(String[] args) {

		CarSold10 audi = new CarSold10();
		
		CarSold10 audi1 = new CarSold10();
		/*try {
			Class.forName("com.learnjava.topic14.instanceblock.CarSold10");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class.forName("com.learnjava.topic14.instanceblock.CarSold10");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}
}
