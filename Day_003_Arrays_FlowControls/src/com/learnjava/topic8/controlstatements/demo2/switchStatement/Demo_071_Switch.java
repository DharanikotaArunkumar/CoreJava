package com.learnjava.topic8.controlstatements.demo2.switchStatement;

public class Demo_071_Switch {

	public static void main(String[] args) {
		// default is executed when non the case is matched . 
		
		char ch ='a';
		
		switch(ch){
		case 'a' :
			System.out.println("you have choosen a vowel");
			break;
			
		case 'e':
			System.out.println("you have choosen e vowel");
			break;
			
		case 'i':
			System.out.println(" you have choosen i vowel");
			break;
			
		case 'o':
			System.out.println("you have choosen o vowel");
			break;
			
		case 'u':
			System.out.println(" you have choosen u vowel");
			break;
			
		default: 
			System.out.println("you have not choosen vowel");
		
		}
	System.out.println("out of switch");	
		

	}

}
