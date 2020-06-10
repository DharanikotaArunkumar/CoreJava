/*
 * remove method is overloaded with index , as well as value .
 * 
 * if you int => its takes inthe index location to be removed 
 * 
 * other then in value it removes value in that array list 
 */

package com.learnjava.topic25.list;

import java.util.ArrayList;

public class Demo_210_List_011 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);
		list.add(12.23f);
		list.add(null);
		list.add("hello");
		list.add(3);
		list.add(12.23f);
		list.add(null); 
		System.out.println(list);
		list.remove(3);  
		System.out.println(list);
		list.remove(12.23f);  
		System.out.println(list);
		
	}

}
