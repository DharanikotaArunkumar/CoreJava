package com.companyname.democollections;

//trimToSize example

import java.util.ArrayList;

public class Demo_List_14 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(3); 
		System.out.println(list);
		list.ensureCapacity(100);// i can set the initial capacity 
		list.trimToSize();// it will trim the initial capacity to the size of present list 
	}

}
