package com.learnjava.topic7.arrays;

/*
 * Is Array is derived data type ?
 * 
 * Yes , its a derived data type . Cool 
 * 
 * All derived data types should have the class right . Then what is class name of array . 
 * 
 * int singleDimentionalArr[]};                ==> class Name :- [I
 * 
 * int twoDimentionalArr[][];			       ==> class Name :- [[I
 * 
 * int multiDimentionalArr[][][];		       ==> class Name :- [[[I
 *  
 *  Note Here "[" indicates the dimension of the array and B,S,I,J,F,D,Z,C or Object or any class name 
 *  represents the data type on which array is build 
 * 
 */

public class Demo_056_Array {

	public static void main(String[] args) {

		// change the data type to other data types
		byte singleDimentionalArr[]={12,13,14};  
		//String singleDimentionalArr[]={"asd","asdsa","asdsad"};  
		Class c=singleDimentionalArr.getClass();  
		String name=c.getName();  
		System.out.println("Single Dimentional Class name is :- "+name);  

	
		short twoDimentionalArr[][]= {{1,2,3}, {4,5,6}};  
		Class c1=twoDimentionalArr.getClass();  
		String name1=c1.getName();  
		System.out.println("Two Dimentional Class name is    :- "+name1);  

	
		long multiDimentionalArr[][][]= {{{1,2,3}, {4,5,6}},{{1,2,3}, {4,5,6}},{{1,2,3}, {4,5,6}}};  
		Class c2=multiDimentionalArr.getClass();  
		String name2=c2.getName();  
		System.out.println("Multi Dimentional Class name is  :- "+name2);  

	
		boolean[] tossFavourResult =new boolean[]{true,false};
		Class c3=tossFavourResult.getClass();  
		String name3=c3.getName();  
		System.out.println("Boolean  Class name is  :- "+name3); 
	
	
		char[] charArray ={'a','b','c'};
		
		Class c4=charArray.getClass();  
		String name4=c4.getName();  
		System.out.println("char  Class name is  :- "+name4); 
	
		
	}

}
