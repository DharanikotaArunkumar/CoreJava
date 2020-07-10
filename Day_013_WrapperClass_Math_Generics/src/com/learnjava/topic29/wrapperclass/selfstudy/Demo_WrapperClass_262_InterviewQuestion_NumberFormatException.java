/*
 * what is the output of below program ?
 * 
 * 
 * Answer :-  
 * 
 * Hash code method is overridden for the value of the wrapper class .
 * in this case 100 , 
 * 
 * So we will get same hashcode for value1 and value 2 ,
 * 
 * But still the hashcode are same they are not stored in the same location 
 * as they created with new operator . So answer of line 30 will be false
 * 
 */

package com.learnjava.topic29.wrapperclass.selfstudy;

public class Demo_WrapperClass_262_InterviewQuestion_NumberFormatException {

	public static void main(String[] args) {

		Integer value1 = new Integer(100);
		Integer value2 = new Integer(100);

		System.out.println("Value 1 hashcode "+ value1.hashCode());
		System.out.println("Value 2 hashcode "+ value2.hashCode());
		
		
		System.out.println(value1 == value2);

	}
}
