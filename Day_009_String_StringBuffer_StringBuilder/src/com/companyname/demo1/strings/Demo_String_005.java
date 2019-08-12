package com.companyname.demo1.strings;

// equals to method check for the content and == checks for the  reference address

public class Demo_String_005 {

	public static void main(String[] args) {
		String str= "Hello";		
		String str1 =str;
		
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
	}

}
