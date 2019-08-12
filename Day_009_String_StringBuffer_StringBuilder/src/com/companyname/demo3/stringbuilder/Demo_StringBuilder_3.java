package com.companyname.demo3.stringbuilder;

public class Demo_StringBuilder_3 {

	public static void main(String[] args) {
		//insert method
		StringBuilder str1 =new StringBuilder("Hello");
		str1.insert(5, "World");
		System.out.println(str1);
		
		//delete
		System.out.println(str1.length());
		str1.delete(5, 10);
		System.out.println(str1);
		
		str1.delete(5, 20);
		System.out.println(str1);
		
		//str1.delete(20, 20);
		System.out.println(str1);
		
		//reverse
		System.out.println(str1.reverse());
		System.out.println(str1);
		
		
		System.out.println(str1.reverse());
		System.out.println(str1);
		
		//replace
		str1.replace(0, 2, "hello ");
		System.out.println(str1);
	}

}
