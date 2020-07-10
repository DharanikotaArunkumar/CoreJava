package com.companyname.demo5.staticdemo;

/*
 * Static variable will be loaded on class loading in the class area /pram gen area .
 * 
 * 		
 * 
 */

class Person{
	
	static int count;
	
	Person(){
		System.out.println("Accessting the  static variable direct  :- "+(++Person.count));
	}
	
		
}


public class Demo_Constructors_04_Static {

	public static void main(String[] args) {
	
		System.out.println(" As static object belongs to class with out creating any object we can accesss static vatiable"+Person.count);
		
		Person.count = Person.count+1;
		
		System.out.println("Accessting the  by using the class name :- "+Person.count);
		

	}

}
