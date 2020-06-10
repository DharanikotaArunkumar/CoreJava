/* 
 * Problem :- Duplicate local variable
 * 
 * Cause :- We write Huge code in the single class, There is a probability for duplicate 
 * variable in the same method
 * 
 * Solution :- identify the variable name and change name to suitable name
 **/
package com.learnjava.topic3.Identifiers.selfstudy;

public class Demo_009_Identifiers_RealTime {

	public static void main(String[] args) {
		int sum = 0;
		 //double sum = 0.0; // Error, Unresolved compilation problem: Duplicate
		
		System.out.println(sum);

	}

}
