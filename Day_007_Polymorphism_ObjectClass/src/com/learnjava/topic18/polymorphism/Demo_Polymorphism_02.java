/*
 * Method Overriding example 2:-
 * 
 * Chameleon changes its color based on surroundings colors to protect self . 
 *  
 */

package com.learnjava.topic18.polymorphism;

class Chameleon {

	public void displayColor(){
		System.out.println("Which color , i should say ..white surroundings ...so white color");
	}
}

class GreenChameleon extends Chameleon {

	public void displayColor(){
		System.out.println("Now ...i am Green Chameleon because i am on green tree");
	}
}

class BlackChameleon extends Chameleon {

	public void displayColor(){
		System.out.println("Now ...i am Black Chameleon because i am on black rock");
	}
}


public class Demo_Polymorphism_02 {

	public static void main(String[] args) {

		Chameleon chameleon = new Chameleon();
		chameleon.displayColor();
		
		GreenChameleon greenChameleon = new GreenChameleon();
		greenChameleon.displayColor();
		
		Chameleon blackChameleon = new BlackChameleon();
		blackChameleon.displayColor();
		
	}

}
