package com.learnjava.topic17.inheritancetypes;

/*
 * Multiple Inheritance 
 * 
 *   
 * 	 								Fruits 										Vegetables
 *	  									|											|
 *	              						---------------------------------------------
 *															|
 *														 Tomato
 *				 
 *
 *				*** Multiple Inheritance is not supported by java
 *
*/

class Fruits {

	boolean isCookAble;
	String color;

	void dispalyInformation() {
			System.out.println(" I am Fruit");
	}

}

class Vegetables {
	boolean isCookAble;
	String color;

	void dispalyInformation() {
		System.out.println(" I am Vegetables");
	}

}

class Tomato extends Fruits{ // 

	boolean isCookAble;
	String color;
}

public class Demo_Inheritance_04 {

	public static void main(String[] args) {
		Tomato obj = new Tomato();
		obj.dispalyInformation();

	}

}
