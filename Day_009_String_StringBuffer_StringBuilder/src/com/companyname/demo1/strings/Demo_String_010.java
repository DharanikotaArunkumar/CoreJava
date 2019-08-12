package com.companyname.demo1.strings;

// String memory locations

public class Demo_String_010 {

	public static void main(String[] args) {
		
		// These will be created in the String constant pool
		String str="Hello";
		String str1 ="World";
		String str2 ="Hello"+"World";
		String str22 ="HelloWorld";
		
		System.out.println(" I am created in string pool ,Are we both are same refernce :- "+ (str2==str22));
		
		// These will be created in the Heap memory 
		
		String str3 =new String("Hello");
		String str4 =new String("World");
		String str5 =new String("HelloWorld");
		String str55 =new String("HelloWorld");
		
		System.out.println(" I am created in Heap  ,Are we both are same refernce :- "+ (str5==str55));
		
		// Where these strings will be stored 
		String str6 ="Hello"+new String("World");
		String str7 =new String("Hello")+"World";
		
		
		System.out.println(" \"Hello\"+new String(\"World\") ,\"HelloWorld\" Are we both are same refernce :- "+ (str6==str2));
		System.out.println(" new String(\"Hello\")+\"World\" ,\"HelloWorld\" Are we both are same refernce :- "+ (str7==str2));
		
		
		//what about thise 
		
		String str8 =str+str1;
		String str9 =str3+str4;
		System.out.println(" str+str1 ,\"HelloWorld\" Are we both are same refernce :- "+ (str8==str2));
		System.out.println(" new String(\"Hello\")new String(\"World\")\" , \"HelloWorld\" Are we both are same refernce :- "+ (str7==str2));
		
		
	
		

	}

}
