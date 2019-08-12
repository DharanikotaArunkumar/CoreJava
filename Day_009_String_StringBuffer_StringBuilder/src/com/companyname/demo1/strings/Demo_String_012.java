package com.companyname.demo1.strings;

public class Demo_String_012 {

	public static void main(String[] args) {
		
		String str ="Hello";
		str.concat("World");
		System.out.println(str);
		
		// created in the heap 
		String str1 =str.concat("World");
		System.out.println(str);
		System.out.println(str1);

	}

}
