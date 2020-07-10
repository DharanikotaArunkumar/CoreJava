package com.companyname.demo3.constructors.thisdemos;

/*
 *   We can use this in the return type and sent to the method argument .
 * 
 */

class Car5 {

	public String name;

	public float price;

	Car5(String name, float price) {
		this.name = name;
		this.price = price;
		
	}

	public void carInformation() {
		System.out.println("Car Name  :- " + name );
		System.out.println("Car price  :- " + price );
		
	}

	public Car5 changeCarPrice() {
		name="myownname";
		price =50f;
		return this;
		
	}

	
	public String getName(){
		
		
		String name="testname";
		
		return name;
	}
}

public class Demo_Constructors_06_This_KeyWord {

	public static void main(String[] args) {

		Car5 audi = new Car5("Audi", 34.56F);
		
		System.out.println("\n");
		System.out.println("Before chaning price");
		audi.carInformation();
		
		audi =  audi.changeCarPrice();
		System.out.println("\n");
		System.out.println("After chaning price");
		audi.carInformation();
		

		Car5 newAudiCar =   audi.changeCarPrice();
		newAudiCar.carInformation();
		 
		}

}