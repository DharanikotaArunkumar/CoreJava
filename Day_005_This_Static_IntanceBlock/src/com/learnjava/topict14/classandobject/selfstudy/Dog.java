package com.learnjava.topict14.classandobject.selfstudy;

// Lets check few more things on the Dog class

public class Dog {

	// Properties or States are called as "fields" 
	
	String color;
	String eyeCOlor;
	float height;
	float weight;
	float length;

	
	// Behaviors  are called as "methods"
	
	void sit(){
		System.out.println(" Yeah Master ..... !!! i will sit but still i will look at you with my "+eyeCOlor+"eyes ");
	}
	
	void layDown(){
		System.out.println(" Superb .....!!! Thanks master ...I was about to say my weight is "+weight+" K.G , So i need to lay down");
	}
	
	void shake(){
		System.out.println(" My height  is "+height+" Ft and my length is "+length+" Ft let me shake my body .");
	}
	
	void come(){
		System.out.println(" I am coming towards you and my color is "+color);
	}

	
	public static void main (String[] args){
		
		Dog doberMan = new Dog();
		
		// new is a operator to create the object in memory .
		
		
		// here in order to access any member of the class we need to use (.) dot operator .which is called member operator .
		doberMan.color= "Black"; 
		doberMan.eyeCOlor ="Black";
		doberMan.height =2.5f;
		doberMan.weight = 33.5f;
		doberMan.length =3f;
		
		
		doberMan.sit();
		doberMan.layDown();
		doberMan.shake();
		doberMan.come();
		
		
		Dog boxer = new Dog();
		
		
		boxer.color= "Brown"; 
		boxer.eyeCOlor ="Brown";
		boxer.height =2.1f;
		boxer.weight = 25f;
		boxer.length =4f;
		
		boxer.sit();
		boxer.layDown();
		boxer.shake();
		boxer.come();
	}
}


