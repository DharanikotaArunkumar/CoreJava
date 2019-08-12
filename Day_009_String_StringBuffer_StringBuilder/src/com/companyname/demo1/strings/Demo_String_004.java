package com.companyname.demo1.strings;

// Case sensitive

public class Demo_String_004 {

	public static void main(String[] args) {
		String str= "Hello";		
		String str1 =str;
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str==str1);
		
		String str2 ="Hello"+"World";
		String str3 ="Helloworld";
				
		System.out.println(str2==str3);
	}

}
