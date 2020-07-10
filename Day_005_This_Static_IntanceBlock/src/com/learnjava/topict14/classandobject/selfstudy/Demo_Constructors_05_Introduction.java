package com.companyname.demo1.constructors;

/*
 * How compiler will identify constructor ? 
 */

class Car {
	
	/*
	 * When i give the name as same exactly  and with out any return type then its identify as constructor   
	 */
	
	
	/*
	 * name is different then is asking for the return type of the method .
	 */
	
	 Car(){
		 System.out.println("constructor  car");
	}
	 
	 void Car ()
	 {
		 System.out.println("void car");
	 }
	
	void test(){
		 System.out.println("void test");
	}

}


public class Demo_Constructors_05_Introduction {

	public static void main(String[] args) {
		  Car c1= new Car();
		  c1.test();
		  c1.Car();

	}

}
