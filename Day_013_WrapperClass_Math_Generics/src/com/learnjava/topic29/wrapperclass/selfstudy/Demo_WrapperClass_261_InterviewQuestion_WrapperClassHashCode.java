/*
 * what is the output of below program ?
 * 
 * 
 * Answer :-  
 * 
 * 130 cannot be converted to Byte as its out of its range , So we get NumberFormat Exception.
 * 
 */

package com.learnjava.topic29.wrapperclass.selfstudy;

public class Demo_WrapperClass_261_InterviewQuestion_WrapperClassHashCode {

	public static void main(String[] args) {

		
		Byte value1 = new Byte("130");
		

		System.out.println("Value 1 hashcode "+ value1.hashCode());
		
	}
}
