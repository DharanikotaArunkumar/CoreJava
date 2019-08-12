/*
 * Method Overriding example 1:-
 * 
 * If a method in super class and sub class with same name and same arguments .Then that method is said to be method overridden.
 * 
 * One method name but different behaviors .
 *
 */


package com.companyname.demo1.polymorphism;

class Feeling {

	public void DisplayPersonFeeling() {
		System.out.println(" Person got all fellings, But presently i am clam and normal ");
	}
}

class HappyFeeling extends Feeling {

	public void DisplayPersonFeeling() {
		System.out.println(" Feeling very happy ,Because i am at pinnacle of everest ");
	}
}

class LuckyFeeling extends Feeling {

	public void DisplayPersonFeeling() {
		System.out.println(" Feeling Lucky,Becuase got billon dollors lottery   ");
	}
}

class UnLuckyFeeling extends Feeling {
	public void DisplayPersonFeeling() {
		System.out.println(" Feeling UnLucky,Becuase did not get billon dollors lottery   ");
	}
}

public class Demo_Polymorphism_01 {

	public static void main(String[] args) {
	
		Feeling feelingObject = new Feeling();
		feelingObject.DisplayPersonFeeling();
		
		HappyFeeling happyFeelingPerson = new HappyFeeling();
		happyFeelingPerson.DisplayPersonFeeling();
	
		LuckyFeeling luckyFeelingPerson = new LuckyFeeling();
		luckyFeelingPerson.DisplayPersonFeeling();
	
		UnLuckyFeeling unluckyFeelingPerson = new UnLuckyFeeling();
		unluckyFeelingPerson.DisplayPersonFeeling();
		
		String str= "test";
		System.out.println(str.toString());
	
	}

}
