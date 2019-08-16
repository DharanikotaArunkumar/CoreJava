package com.companyname.demo2.List;
// Diff between and add and set

import java.util.ArrayList;

public class Demo_List_10 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add(null);
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add(null);// adding the element to list 
		System.out.println(list);
		list.add(3,"hello"); // it just adds the list and next elements will be moved 
		System.out.println(list);
		list.set(3, "bye"); // updates the index ,and elements will not be moved 
		System.out.println(list);
		
		
	}

}
