/*
 * In before program we saw that .child class implementations has different .Lets explore the fixing the problem.
 */
package com.companyname.demo1.abstractclass.Introducation;

import java.sql.Blob;

class Bird2 {

	public String birdName;
	public Blob birdImage;
	
	Bird2(String name){
		birdName = name;
	}

	public void eatSeeds() {
		System.out.println("I am " + birdName + " Yes ..I will eat feeds ");
	}

	public void drinkWater() {
		System.out.println("I am " + birdName + " Yes ..I will have water");
	}

	public void fly() {
		System.out.println("I am " + birdName + "  bo bye ");
	}

	
}

class Pigeon extends Bird2 {

	Pigeon(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  i will make Hoot Hoot Sound ");
	}
	
}


class Dove extends Bird2 {

	Dove(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  i will make coo ,coo Sound ");
	}
	
}


class Parrot extends Bird2 {

	Parrot(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  tell me what to repeat ");
	}
	
}


class Nightingales extends Bird2 {

	Nightingales(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  Pipe pipe ");
	}
	
}



class Sparrows extends Bird2 {

	Sparrows(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  chirp ");
	}
	
}

public class Demo_AbstractClass_Intro_2 {

	public static void main(String[] args) {
	
		// Bird2 pigeon = new Pigeon("pigeon");
		
		Pigeon pigeon = new Pigeon("pigeon");
		pigeon.makeSound(); // Happy 
		
		Dove dove = new Dove("dove");
		dove.makeSound();// happy :- Now i my sound is correct coo,coo 
				
		Parrot parrot = new Parrot("parrots");
		parrot.makeSound();// happy :- I will talk properly ,
		
		Nightingales nightingales = new Nightingales("nightingales");
		nightingales.makeSound();// happy :- Hey .... Pipe pipe 
		
		Sparrows sparrows = new Sparrows("sparrows");
		sparrows.makeSound();// happy :- i am good with  chirp chirp 
		
	/*
		Bird2 pigeon1 = new Bird2("pigeon");
		pigeon1.makeSound(); 
		*/
	/*	
		Bird2 pigeon2 = new Parrot("pigeon");
		pigeon2.makeSound();
				*/
		
		/*		 Here We are going against few OPP principles 
		 * 			
		 * 		1) Loosing the super class object can hold sun class object.
		 * 		2) Contradiction to Class definition . make sound is common method should be present in super class also .
		 * 	 			Class :- A class is kind of the blueprint or template that describes the common state and behavior that will be in each object. 
		 * 
		 * 
		*/	
	}

}