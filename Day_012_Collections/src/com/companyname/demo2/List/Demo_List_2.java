package com.companyname.demo2.List;
// Collections accepts only objects ,

import java.util.ArrayList;

public class Demo_List_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		System.out.println(list);
		int num =10;
		Integer ii = new Integer(10);
		list.add(num);
	}

}
