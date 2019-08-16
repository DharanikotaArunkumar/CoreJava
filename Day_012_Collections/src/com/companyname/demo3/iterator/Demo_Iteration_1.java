package com.companyname.democollections;
// 1) iterator example

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Iteration_1 {

	@SuppressWarnings("unchecked")
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
		
		Iterator it = list.iterator();
		System.out.println(" Iterator started");
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(" Iterator ended");
		
	}

}
