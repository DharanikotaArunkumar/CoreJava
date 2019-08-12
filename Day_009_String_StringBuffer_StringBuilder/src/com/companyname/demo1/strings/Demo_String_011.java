package com.companyname.demo1.strings;

//How many strings will be created 

public class Demo_String_011 {

	public static void main(String[] args) {
		// These will be created in the String constant pool
				String str="Hello";
				String str1 ="World";
				String str2 ="Hello"+"World";
				String str22 ="HelloWorld";
				
				
				// These will be created in the Heap memory 
				
				String str3 =new String("Hello");
				String str4 =new String("World");
				String str5 =new String("HelloWorld");
				String str55 =new String("HelloWorld");
				
				// These will be created in the Heap memory 
				
				String str6 ="Hello"+new String("World");
				String str7 =new String("Hello")+"World";
				
				// These will be created in the Heap memory 
				String str8 =str+str1;
				String str9 =str3+str4;
				

	}

}
