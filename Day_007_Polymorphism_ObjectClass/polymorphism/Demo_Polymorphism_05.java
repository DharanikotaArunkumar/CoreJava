/*
 * static methods can not be overridden by non static method 
 */
package com.companyname.demo1.polymorphism;


class superClass {
	
	public static void displayInformation(){
		System.out.println("I am super Static Method");
	}
	
	public  void displayInformationNonStatic(){
		System.out.println("I am super non Static Method");
	}
	
}

class childClass extends superClass{
	
	public static void displayInformation(){
		System.out.println("I am child static  Method");
	}
	
	public  void displayInformationNonStatic(){
		System.out.println("I am child non Static Method");
	}
}



public class Demo_Polymorphism_05 {

	public static void main(String[] args) {
		superClass superClass = new superClass();
		/*superClass.displayInformation();
		superClass.displayInformationNonStatic();
		*/
		childClass childClass = new childClass();
		/*childClass.displayInformation();
		childClass.displayInformationNonStatic();
		*/
		
		superClass=childClass;
		
		superClass.displayInformation(); // to whom your assigned matter
		superClass.displayInformationNonStatic(); // to whom your rfering is matters

	}

}
