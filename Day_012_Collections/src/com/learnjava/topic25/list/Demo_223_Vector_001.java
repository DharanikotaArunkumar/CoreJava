package com.learnjava.topic25.list;


import java.util.Vector;

public class Demo_223_Vector_001 {

	public static void main(String[] args) {

		Vector<Object> list = new Vector<Object>();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		System.out.println(list);
	}

}
