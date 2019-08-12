package com.companyname.demo1.strings;

// String immutable example

public class Demo_String_003 {

	public static void main(String[] args) {
		String str= "Hello";
		
		String str5 ="World";
		String str1 =str;
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str==str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str5.hashCode());
		
		
		String str2 ="Hello"+"World";
		String str3 ="HelloWorld";
				
		System.out.println(str2==str3);
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
	
	}

}
