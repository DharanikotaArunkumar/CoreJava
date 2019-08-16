package com.companyname.demo2.List;

import java.util.ArrayList;

public class Demo_List_11 {

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
