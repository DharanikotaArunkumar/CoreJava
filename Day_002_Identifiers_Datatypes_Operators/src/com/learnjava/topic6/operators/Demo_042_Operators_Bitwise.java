package com.learnjava.topic6.operators;

public class Demo_042_Operators_Bitwise {

	public static void main(String[] args) {
		int x=10,y=11;
		// 10 = 0000 1010
		// 11 = 0000 1011
		
	
		
		//bitwise AND
		System.out.println(x&y); //0000 1010
		// bitwise OR
		System.out.println(x|y); //      0000 1011
		// bit wise XOR
		System.out.println(x^y);  //0000 0001
		
		//bitwise left shift
		System.out.println(x<<4);  // 000 10100
		
		//bitwise Right shift		
		System.out.println(y>>2);
	}

}
