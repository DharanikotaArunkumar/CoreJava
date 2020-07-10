package com.learnjava.topic29.wrapperclass;

public class Demo_WrapperClass_255_NumberFormats {

	public static void main(String[] args) {
		
		int value = 120;
		
		
		// All numbers are in decimal format , i.e 0-9 , Like 1,5,9,11,57,145,1254,8764 etc.
		
		System.out.println("Value is "+value); // default java treats in decimal format

		
		// How to convert to binary format , i.e 0,1  
		
		System.out.println("binary format " +Integer.toBinaryString(value));
		
		// How to convert to octal format , i.e any number can be represent with these 0,1,2,3,4,5,6,7
		
		System.out.println("octal format"+Integer.toOctalString(value));
		
		// How to convert to hexadecimal format , i.e any number can be represent with these 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f

		System.out.println("hexadecimal format"+Integer.toHexString(value));
		
		
		 // if you want your own number format , like 5 
		System.out.println("my own format "+Integer.valueOf("120", 5));
		
		
		// any type of conversation to decimal
		System.out.println(Integer.valueOf("100", 10));

	}

}
