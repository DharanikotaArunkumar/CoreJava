package com.companyname.demo1.constructors;

/* Constructor is the executable block.  where is that executable block and 
 * look at "Dog1()" seems like a method syntax where is that method if in case exist . if that particular code is not exist there should
 * be a compiler time error .but code does not give any error why ?
 * 
 */

class Dog1 {

	String color;
	String eyeCOlor;
	float height;
	float weight;
	float length;
	
	// As we does not provide any executable block here . Compiler will provide the default Constructor .
	
	
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

public class Demo_Constructors_02_Introduction {

	public static void main (String[] args){
		
		Dog1 doberMan = new Dog1();
	

		
		
		doberMan.color= "Black"; 
		doberMan.eyeCOlor ="Black";
		doberMan.height =2.5f;
		doberMan.weight = 33.5f;
		doberMan.length =3f;
		
		
		doberMan.sit(); 
		doberMan.layDown();
		doberMan.shake();
		doberMan.come();
		
		
		Dog1 boxer = new Dog1();
		
		
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

	
