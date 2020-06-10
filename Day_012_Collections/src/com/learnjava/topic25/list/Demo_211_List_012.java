package com.learnjava.topic25.list;

import java.util.ArrayList;

public class Demo_211_List_012 {

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
		list.remove(3);  // based on index 
		System.out.println(list);
		list.remove(new Integer(3)); //based on the value 
		System.out.println(list);
	}

}
