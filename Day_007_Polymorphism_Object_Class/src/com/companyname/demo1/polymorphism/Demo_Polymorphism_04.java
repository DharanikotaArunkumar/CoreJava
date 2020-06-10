/*
 * How to stop overriding the parent class methods ?.
 *        final method stops from overriding
 */

package com.companyname.demo1.polymorphism;

class KFC {

	// Add final key word
	public   void ingredientsOfFriedChicken() {
		System.out.println(
				"Mix all purpose flour, green chillies, white pepper, oregano, garlic, ginger, basil or tulsi leaves, remaining chilli powder and salt. ");
	}
}

class NYC_KFC extends KFC {
	
	
	public void ingredientsOfFriedChicken() {
		System.out.println(
				"only flour, green chillies, white pepper ."); // KFC will get a problem with quality , KFC want to assure same quality all over branchs 
	}
}

public class Demo_Polymorphism_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
