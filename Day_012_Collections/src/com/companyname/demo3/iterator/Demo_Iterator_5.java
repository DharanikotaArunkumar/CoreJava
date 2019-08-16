package com.companyname.democollections;

// iterator is applicable for both list and sets 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo_Iterator_5 {

	public static void main(String[] args) {
		// List example
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
			
		}
		System.out.println("Ended Iterator and the elements are "+list);
		
		//Set Example
		
		Set<Object> set =new HashSet<Object>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		System.out.println(set);
		Iterator itset = set.iterator();
		System.out.println(" Iterator started and the elements are "+set);
		
		while(itset.hasNext()){
			
			System.out.println(itset.next());  
			
		}
		System.out.println("Ended Iterator and the elements are "+set);
		
	}

}
