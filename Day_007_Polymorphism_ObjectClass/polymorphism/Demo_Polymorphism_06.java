/*
 * non static methods can not be overridden by  static method 
 * 
 * Conclusion :- Overriding method should have the exactly same method signature as super class
 */
package com.companyname.demo1.polymorphism;


class superClass1 {
	
	public void displayInformation(){
		System.out.println("I am non Static Method");
	}
}

class childClass1 extends superClass1{
	
	public  void displayInformation(){
		System.out.println("I am non static  Method");
	}
}


public class Demo_Polymorphism_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
