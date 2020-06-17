/*
 * non static methods can not be overridden by  static method 
 * 
 * Conclusion :- Overriding method should have the exactly same method signature as super class
 */
package com.learnjava.topic18.polymorphism;


class superClass1 {
	
	public  void displayInformation(){
		System.out.println("I am  Static Method from super class");
	}
}

class childClass1 extends superClass1{
	
	public   void displayInformation(){
		System.out.println("I am non static  Method from child class ");
	}
}


public class Demo_Polymorphism_06 {

	public static void main(String[] args) {
		
		superClass1 superObj = new superClass1();
		superObj.displayInformation();
		childClass1 childObj = new childClass1();
		childObj.displayInformation();
		
		superClass1 superClassObjCanHoldSubClassObj = new childClass1();
		superClassObjCanHoldSubClassObj.displayInformation();
		
		

	}

}
