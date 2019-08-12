package com.companyname.demo2.constructorstypes;
/*
 * We know a class contain multiple constructors .so constructors can overloaded 
 * 
 * overloading rule :-
 * 			1) Same class name
 * 			2) Different Argument list 
 */
class Car5 {

	public String name;
    public String model;
    
	Car5(String carName,String carModel) {
		
		name = carName;
		model = carModel;
		System.out.println("I am Ready ....!!! My name is  :-"+name+ " car and my model is "+carModel);
	}

	
	Car5(String carName) {
		this();
		name = carName;
		System.out.println("I am Ready ....!!! My name is  :-"+name+ " car");
	
	}

	Car5() {
		
		System.out.println("No -aug Constructor called");
	}

	public void drive() {
		this.stop();
		
		
		System.out.println(this.model);
		System.out.println("Drving the " + name + "Car....!!!");

	}
	
	public void stop() {
		System.out.println("Drving the " + name + "Car....!!!");

	}

}

public class Demo_Costructors_06_ConstructorTypes {

	public static void main(String[] args) {

		/*Car5 audi = new Car5("Audi","2018");
		//audi.drive();
*/		
	/*	Car5 bmw = new Car5();
		bmw.drive();*/
		

		Car5 benz = new Car5("benz");
		benz.drive();
	
	}

}
