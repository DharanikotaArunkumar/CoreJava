package com.companyname.demo5.staticdemo;

/*
 * just add the static before int count.
 * 
 * only change when compared to previous code is added static
 * 
 */

class CarSold1{
	
	static int count;
	
	int value;
	
	CarSold1(){
		count++;
	}
	
	public void displayNoCarsSold(){
		System.out.println(" No of Cars Sold "+count);
	}	
}


public class Demo_Constructors_02_Static {

	public static void main(String[] args) {
		
		CarSold1 audi = new CarSold1();
		audi.displayNoCarsSold();
		
		CarSold1 bmw = new CarSold1();
		bmw.displayNoCarsSold();
		
		CarSold1 benz = new CarSold1();
		benz.displayNoCarsSold();
		
		CarSold1 volkswagen = new CarSold1();
		volkswagen.displayNoCarsSold();
		
		CarSold1 toyota = new CarSold1();
		toyota.displayNoCarsSold();
		

	}

}
