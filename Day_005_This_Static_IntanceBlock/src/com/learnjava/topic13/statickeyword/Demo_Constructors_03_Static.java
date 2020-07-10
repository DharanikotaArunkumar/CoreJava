package com.companyname.demo5.staticdemo;

/*
 * Accessing the static variable in code
 * 
 */

class CarSold2{
	
	static int count;
	
	String name;
	
	CarSold2(){
		System.out.println("Accessting the  static variable direct  :- "+(++CarSold2.count));
	}
	
	public void displayNoCarsSold(){
		System.out.println(" No of Cars Sold "+count);
	}	
}


public class Demo_Constructors_03_Static {

	public static void main(String[] args) {
	
		System.out.println("Accessting the  by using the class name :- "+CarSold2.count);
		
		CarSold2.count = CarSold2.count+1;
		
		System.out.println("Accessting the  by using the class name :- "+CarSold2.count);
		
		CarSold2 audi = new CarSold2();
		
		System.out.println("Accessting the  by using the object name :- "+audi.count); // we can access by using object .but not advised
		
		CarSold2 bmw = new CarSold2();
		
		System.out.println("Accessting the  by using the object name :- "+bmw.count);
		
		
		CarSold2 tata = new CarSold2();
		
		
		
		
		

	}

}
