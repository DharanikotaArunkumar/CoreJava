/*
 * what is the output of below program ?
 * 
 * 
 * Answer :-  
 * 
 * case 1 :-  value is with in the range -128 to +127 then , Object will be parsed with
 * Integer.parseInt(); it uses the Integer.IntegerCache range
 * 
 * case 2 :-one we are out of Integer Cache range -128 to +127 , object will be created
 * with new Integer(value) ;
 * 
 */


package com.learnjava.topic29.wrapperclass.selfstudy;

public class Demo_WrapperClass_260_InterviewQuestion_IntegerCache {
	
	public static void main(String[] args) {
	
		Integer value1 = 128;
		Integer value2 = 128;
		
		if (value1 == value2) {
			System.out.print("Both are same");
		} else {
			System.out.print("Both are not same");
		}
	}
}
