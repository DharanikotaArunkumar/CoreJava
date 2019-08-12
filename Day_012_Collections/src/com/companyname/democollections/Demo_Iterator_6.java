package com.companyname.democollections;

/*it been defined in the only list 
==> it has 3 methods 
hasNext():- return true if the elements are present .
next() :- it returns the next object
remove() :- removes the last element from the collection
hasPrevious() :- return true if the elements are present 
previous() :- points to previous element


==> it is bi directional iterator , iterator can  come back to the start once its iterated all
elements*/

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo_Iterator_6 {
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
			
		}
		System.out.println("Ended Iterator ");
		
		
		System.out.println(" List Iterator started ");
		
		while(it.hasPrevious()){
			
			System.out.println(it.previous());  
			
		}
		System.out.println("List Iterator Ended");
		
		
		
	}

}
