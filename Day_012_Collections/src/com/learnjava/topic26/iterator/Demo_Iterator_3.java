package com.learnjava.topic26.iterator;
// remove() :- it removes the elements from the collections

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Iterator_3 {
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
		System.out.println(" Iterator started and the elements are "+list);
		
		while(it.hasNext()){
			System.out.println(it.next());
			it.remove();
		}
		System.out.println("Ended Iterator and the elements are "+list);
		
			
	}

}
