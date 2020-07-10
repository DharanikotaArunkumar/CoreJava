package com.companyname.demo5.staticdemo;

/*
 * How to find the no of car sold from the show room .
 */

class CarSold{
	
	int count;
	
	CarSold(){
		count++;
	}
	
	public void displayNoCarsSold(){
		System.out.println(" No of Cars Sold "+count);
	}	
}


public class Demo_Constructors_01_Static {

	public static void main(String[] args) {
		
		CarSold audi = new CarSold();
		audi.displayNoCarsSold();
		
		CarSold bmw = new CarSold();
		bmw.displayNoCarsSold();
		
		CarSold benz = new CarSold();
		benz.displayNoCarsSold();
		
		CarSold volkswagen = new CarSold();
		volkswagen.displayNoCarsSold();
		
		CarSold toyota = new CarSold();
		toyota.displayNoCarsSold();
		

	}

}
