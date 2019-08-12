package com.companyname.democollections;

// For each iterator 
import java.util.ArrayList;

public class Demo_Iterator_8 {

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
		System.out.println(list);
		
		for(Object ob:list){
			System.out.println(ob);
		}
		
	}

}
