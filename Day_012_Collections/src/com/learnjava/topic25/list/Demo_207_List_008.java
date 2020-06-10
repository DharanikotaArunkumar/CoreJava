package com.learnjava.topic25.list;
// get and add(index,value) examples

import java.util.ArrayList;

public class Demo_207_List_008 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add(null);
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add(null);
		System.out.println(list.get(5));// to the element at that location 
		list.add(5, "hi");// add the element in index , next values will be moved 
		System.out.println(list);
		System.out.println(list.get(5));
		
		
	}

}
