/*
 * Below program tells us that ...all common methods should be written in the class . The implementation of 
 * eatSeeds()
 * drinkWater()
 * fly()
 * 
 * are proper .But the makeSound() should be there for all birds but their implementation is different .
 * 
 * This program says only program statement 
 * 
 */

package com.companyname.demo1.abstractclass.Introducation;

import java.sql.Blob;

class Bird {

	public String birdName;
	public Blob birdImage;
	
	Bird(String name){
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

	public void makeSound() {
		System.out.println("I am " + birdName + "  i will make Hoot Hoot Sound ");
	}
}

public class Demo_AbstractClass_Intro_1 {

	public static void main(String[] args) {
	
		Bird pigeon = new Bird("pigeon");
		pigeon.makeSound(); // Happy 
		
		Bird dove = new Bird("dove");
		dove.makeSound();// Unhappy :- My sound is coo ,coo
				
		Bird parrot = new Bird("parrots");
		parrot.makeSound();// Unhappy :- I will talk properly ,
		
		Bird nightingales = new Bird("nightingales");
		nightingales.makeSound();// Unhappy :- I will say Pipe pipe 
		
		Bird sparrows = new Bird("sparrows");
		sparrows.makeSound();// Unhappy :- i say chirp chirp 
		
	}

}
