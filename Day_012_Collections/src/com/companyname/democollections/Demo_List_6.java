package com.companyname.democollections;
// size () method returns the int value .

import java.util.ArrayList;

public class Demo_List_6 {

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
		System.out.println(list.size());
	}

}
