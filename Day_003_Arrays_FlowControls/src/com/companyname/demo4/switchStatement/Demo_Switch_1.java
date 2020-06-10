package com.companyname.demo4.switchStatement;

public class Demo_Switch_1 {

	public static void main(String[] args) {
		// default is executed when non the case is matched . 
		
	
		char choice ='k';
		
		switch(choice){
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
