package com.learnjava.topic17.inheritancetypes;

/*
 * Hybrid Inheritance 
 * 
 *   
 * 	 											Fruits 									
 *	  											  |											
 *	              		---------------------------------------------------------
 *						|						  |								|
 *					Citrus					   Topical						Berries							
 *												  |
 *										--------------------
 *									    |					|	 
 *								With out Seed			With Seed 
 *									(Coconut)
 *				
 *
*/

class Fruit {

	String fruitName;

	void dispalyInformation() {
		System.out.println(" I am Fruit" + fruitName);
	}

}

class Citrus extends Fruit {
	String taste;

	void dispalyInformation() {
		System.out.println(" I am Citrus");
	}

}

class Topical extends Fruit {

	boolean isCookAble;

	void dispalyInformation() {
		System.out.println(" I am Topical");
	}

}

class Berries extends Fruit {

	void dispalyInformation() {
		System.out.println(" I am Berries");
	}

}

class WithOutSeed extends Topical {

	void dispalyInformation() {
		System.out.println(" I am with out seed ");
	}

}

class WithSeed extends Topical {

	void dispalyInformation() {
		System.out.println(" I am with seed ");
	}

}

public class Demo_Inheritance_05 {

	public static void main(String[] args) {
		
		Citrus orange = new Citrus();
		Berries strawberry = new Berries();
		WithSeed  kiwi = new WithSeed();
		WithOutSeed coconut = new WithOutSeed();
		coconut.dispalyInformation();

	}

}
