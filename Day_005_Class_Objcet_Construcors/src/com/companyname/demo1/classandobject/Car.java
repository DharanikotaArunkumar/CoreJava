package com.companyname.demo1.classandobject;

public class Car {

	String modelName;
	String color;
	int NoOfGears; 
	int maxSpeed;
	
	
	void run(){
		System.out.println("Hello");
		System.out.println("I can go with speed of "+maxSpeed);
	}
	
	
	void start(){
		System.out.println("Please note i have "+NoOfGears+ " Gears");
	}
	
	void aboutCar(){
		System.out.println("All About Car \n");
		System.out.println("Car Name :-"+modelName);
		System.out.println("Color    :-"+color);
		System.out.println("No Of Gears    :-"+NoOfGears);
		System.out.println("max Speed :-"+color);
	}
	
	
	public static void main(String[] args) {
	
	Car bmw = new Car();
	
	bmw.color = "White";
	bmw.maxSpeed = 300;
	bmw.modelName = "i8 Model";
	bmw.NoOfGears = 6;
	
	bmw.start();
	bmw.run();
	bmw.aboutCar();
	
	System.out.println("\n\n\nNow its all about audi \n");
	
	Car audi = new Car();
	
	audi.color = "SIlver";
	audi.maxSpeed = 280;
	audi.modelName = "A8 Model";
	audi.NoOfGears = 5;
	
	audi.start();
	audi.run();
	audi.aboutCar();
	
	
	}

}
