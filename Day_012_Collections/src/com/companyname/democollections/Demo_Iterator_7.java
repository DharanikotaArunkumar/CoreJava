package com.companyname.democollections;
// List iterator has the add method , we can add the elements to the  list

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo_Iterator_7 {

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
				ListIterator it = list.listIterator();
				System.out.println(" Iterator started and the elements are "+list);
				
				while(it.hasNext()){
				
					
					System.out.println(it.next());  
					it.add("500");
					
				}
				System.out.println("Ended Iterator and the elements are "+list);
				
				
				
				
	}

}
