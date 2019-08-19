package com.companyname.demo2.List;

// isEmpty and clear 

import java.util.ArrayList;

public class Demo_List_7 {

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
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
	}

}
