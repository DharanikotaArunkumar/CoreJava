/*
 * Lets fix the problem which we loosing in previous program.
 */
package com.companyname.demo1.abstractclass.Introducation;

import java.sql.Blob;

  abstract class Bird3 {

	public String birdName;
	public Blob birdImage;
	
	Bird3(String name){
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

	//public void makeSound() ; // see the suggestion its giving us . Add abstract
	//public abstract void  makeSound(); // see the suggestion its giving us . Add abstract to class level
	public  abstract void makeSound();

 }

class Pigeon3 extends Bird3 {

	Pigeon3(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(" i make sound as hoot hoot");
		
	}
	
	
	
}


class Dove3 extends Bird3 {

	Dove3(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  i will make coo ,coo Sound ");
	}
	
}


class Parrot3 extends Bird3 {

	Parrot3(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  tell me what to repeat ");
	}
	
}


class Nightingales3 extends Bird3 {

	Nightingales3(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  Pipe pipe ");
	}
	
}



class Sparrows3 extends Bird3 {

	Sparrows3(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println("I am " + birdName + "  chirp  chirp");
	}
	
}

public class Demo_AbstractClass_Intro_3 {

	public static void main(String[] args) {
	
		Bird3 bird = new Bird3();
		bird.makeSound();
		
		
		Bird3  Pigeon3 = new Pigeon3("Pigeon3");
		Pigeon3.makeSound(); // Happy 
		
		Bird3  Dove3 = new Dove3("Dove3");
		Dove3.makeSound();// happy :- Now i my sound is correct coo,coo 
				
		Bird3  Parrot3 = new Parrot3("parrots");
		Parrot3.makeSound();// happy :- I will talk properly ,
		
		Bird3  Nightingales3 = new Nightingales3("Nightingales3");
		Nightingales3.makeSound();// happy :- Hey .... Pipe pipe 
		
		Bird3  Sparrows3 = new Sparrows3("Sparrows3");
		Sparrows3.makeSound();// happy :- i am good with  chirp chirp 
		
	
	
	}

}