package com.companyname.demo1.classandobject;

public class Dog {

	// Properties or States
	
	String color;
	String eyeCOlor;
	float height;
	float weight;
	float length;
	
	// Behaviors 
	
	
	Dog(){
		super();
		System.out.println("I am called");
	}
	
	
	
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
		/*		Class    :- Blue Print
				Object  :- Special copy of blue print .
		 */
		// creating the copy of the blue print
		Dog doberMan = new Dog();
		
		
		System.out.println(doberMan.color +" "+doberMan.eyeCOlor +"   "+doberMan.height+" "+doberMan.length+ "   "+doberMan.weight);
		// lets assign values to copy
		doberMan.color= "Black"; 
		doberMan.eyeCOlor ="Black";
		doberMan.height =2.5f;
		doberMan.weight = 33.5f;
		doberMan.length =3f;
		
		// Now Lets do come Behaviors of Dog
		
		doberMan.sit();
		doberMan.layDown();
		doberMan.shake();
		doberMan.come();
		
		// creating the copy of the blue print
		Dog boxer = new Dog();
		
		// lets assign values to copy
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
