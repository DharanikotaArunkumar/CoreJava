package com.companyname.demo3.constructors.thisdemos;

/*
 *   passing this as method argument  .

 * 
 */

class Car6 {

	public String name;

	public float price;

	Car6(String name, float price) {
		this.name = name;
		this.price = price;

	}

	public void printCarInfomration() {
		
		PrintCarInformation object = new PrintCarInformation();
		object.carInformation(this);
		
		
		/*new PrintCarInformation().carInformation(this);*/

	}

}

class PrintCarInformation {

	public void carInformation(Car6 car) {
		System.out.println("Car Name  :- " + car.name);
		System.out.println("Car price  :- " + car.price);

	}
}

public class Demo_Constructors_07_This_KeyWord {

	public static void main(String[] args) {

		Car6 audi = new Car6("Audi", 34.56F);
		audi.printCarInfomration();
	}

}