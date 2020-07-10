package com.companyname.demo1.constructors;

/*
 * Old example which we have seen in class and object .
 */

class Dog {

	String color;
	String eyeCOlor;
	float height;
	float weight;
	float length;
	
	
	
	
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

}

public class Demo_Constructors_01_Introduction {

	public static void main (String[] args){
		
		Dog doberMan = new Dog();
		
		// new is a operator to create the object in memory  in the heap .
		/*
		Step 1 :- A object will be created in the heap 
		Step 2 :- i will load all the variables in the heap 
		Step 3 :- default values will be assigned 
		Step 4 :- references to the methods will be created and stores in the method area . 
		Step 5 :- Temporary reference will be created to the object and returned to program . 
		Step 6 :- We are assigning that reference to object name (doberMan) . 
		*/
		
		
		doberMan.color= "Black"; 
		doberMan.eyeCOlor ="Black";
		doberMan.height =2.5f;
		doberMan.weight = 33.5f;
		doberMan.length =3f;
		
		
		doberMan.sit(); // Calling a method .
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

	
