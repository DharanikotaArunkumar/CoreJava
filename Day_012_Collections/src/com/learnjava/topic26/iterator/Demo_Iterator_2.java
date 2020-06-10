package com.learnjava.topic26.iterator;

// Iterator are single directional 

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Iterator_2 {

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
		System.out.println("Second Iterator started");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Second Iterator ended");
			
	}

}
