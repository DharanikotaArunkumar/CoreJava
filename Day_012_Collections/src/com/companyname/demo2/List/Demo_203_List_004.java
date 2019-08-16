package com.companyname.demo2.List;

// Duplicates are allowed here ,

import java.util.ArrayList;

public class Demo_List_4 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		System.out.println(list);
	}

}
