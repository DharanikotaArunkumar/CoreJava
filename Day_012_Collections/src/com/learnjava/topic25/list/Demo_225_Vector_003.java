package com.companyname.democollections;

import java.util.Vector;

//Vector accept the null values 
//size () method returns the int value .
//isEmpty and clear

public class Demo_Vector_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Object> list = new Vector<Object>();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add(null);
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add(null);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(5));// to the element at that location 
		list.add(5, "hi");// add the element in index , next values will be moved 
		System.out.println(list);
		System.out.println(list.get(5));
	}

}
