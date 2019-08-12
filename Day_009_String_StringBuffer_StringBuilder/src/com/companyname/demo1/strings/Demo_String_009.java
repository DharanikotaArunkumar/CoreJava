package com.companyname.demo1.strings;

public class Demo_String_009 {

	public static void main(String[] args) {
		
		// Here str ,str1 points to the different  reference in the heap memory 
		String str =new String("Hello");
		String str1 =new String("Hello");	
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str==str1);
		
		
		// Here str2 ,str3 points to the same reference in the string constant pool
		String str2 ="Hello";
		String str3 ="Hello";
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2==str3);
		
		//lets check of content , Always check the equals to between to strings 
		
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str));
		
		
	}

}
