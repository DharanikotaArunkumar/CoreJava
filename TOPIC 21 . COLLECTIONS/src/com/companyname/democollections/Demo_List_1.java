package com.companyname.democollections;

//Example of the Array list

import java.util.ArrayList;

public class Demo_List_1 {

	public static void main(String[] args) {
		
			ArrayList list = new ArrayList();
			list.add("hello");
			list.add(10);
			list.add(12.23f);
			System.out.println(list);
			System.out.println(list.get(0));
			Integer object =(int) list.get(1);
			System.out.println(object);
			
	}

}
