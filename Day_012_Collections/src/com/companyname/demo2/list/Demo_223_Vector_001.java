package com.companyname.democollections;


import java.util.Vector;

public class Demo_Vector_1 {

	public static void main(String[] args) {

		Vector<Object> list = new Vector<Object>();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		System.out.println(list);
	}

}
