package com.learnjava.topic25.list;

// toString() method been overridden 

import java.util.ArrayList;

public class Demo_202_List_003 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		System.out.println(list);// How the elements been printed when gave list name ?
		System.out.println(list.toString());
	}

}
