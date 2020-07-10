/*
 * What is wrapper class ?
 * Wrapper class are the representation of the primitive data types in object form.
 * all wrapper class are sub class of the Number class . java.lang.Number
 
  	byte		-->				java .lang.Byte
 
  	int			-->				java .lang.Interger
 	
 	short		-->				java .lang.Short
 
 	long		--> 			java .lang.Long
 
 	float		--> 			java .lang.Float

 	double      --> 			java .lang.Double
 	
 	char 		-->				java.lang.Charater
 
 	boolean 	-->				java.lang.Boolean
 
 *  
 * Why we need wrapper class in java ?
 *  
 *1) To support OOPS language 
 *2) if some frameworks expects the objects all the time then these class are useful,
* 3) To get the power of object class methods and other api methods of wrapper class .
* 
*   
 * 
 */

package com.learnjava.topic29.wrapperclass;

public class Demo_WrapperClass_250_Why_WrapperClass {

	public static void main(String[] args) {

		int value = 120;
		Integer objectInteger1 = 50;
		Integer objectInteger2 = new Integer(value); //Integer.parseInt(120);
		Integer objectInteger3 = new Integer("10");

		System.out.println(" Object value is " + objectInteger1);

		System.out.println(" Object value is " + objectInteger2);

		System.out.println(" Object value is " + objectInteger3);

	}

}
