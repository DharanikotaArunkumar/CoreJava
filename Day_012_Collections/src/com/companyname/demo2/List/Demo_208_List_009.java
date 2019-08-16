package com.companyname.demo2.List;
// IndexOutOfBoundsException :-  we will not get ArrayOutOfBoundException

import java.util.ArrayList;

public class Demo_List_9 {

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
		System.out.println(list.get(15));// what happens now ?
		
	}

}
