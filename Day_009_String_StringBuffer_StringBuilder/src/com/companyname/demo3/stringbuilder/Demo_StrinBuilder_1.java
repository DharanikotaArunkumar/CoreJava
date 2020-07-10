package com.companyname.demo3.stringbuilder;

public class Demo_StrinBuilder_1 {

	public static void main(String[] args) {
		String str =new String("Hello");
		StringBuilder str1 =new StringBuilder("Hello");
		
		//str = str.concat("world");
		System.out.println(str.concat("world"));
		System.out.println(str1.append("world"));
		
		System.out.println(str);
		System.out.println(str1);
	}

}
