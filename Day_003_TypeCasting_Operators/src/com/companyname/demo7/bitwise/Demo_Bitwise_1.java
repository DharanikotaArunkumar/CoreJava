package com.companyname.demo7.bitwise;

public class Demo_Bitwise_1 {

	public static void main(String[] args) {
		int x=10,y=11;
		// 10 = 0000 1010
		// 11 = 0000 1011
		
		//bitwise AND
		System.out.println(x&y); //0000 1010
		// bitwise OR
		System.out.println(x|y); //      0000 1011
		// bit wise XOR
		System.out.println(x^y);
		
		//bitwise left shift
		System.out.println(x<<2);
		
		//bitwise Right shift		
		System.out.println(y>>2);
	}

}
