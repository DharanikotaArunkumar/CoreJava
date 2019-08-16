/*
 * ConcurrentModificationException Example 
 */

package com.companyname.demo2.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo_218_List_CopyOnWriteArrayList_001 {

	public static void main(String[] args) {
				
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(1);
		integerList.add(2);		
		integerList.add(3);		
		integerList.add(4);		
		integerList.add(5);		
		integerList.add(6);		
		integerList.add(7);
		
		Iterator<Integer> intListiterator = integerList.iterator();
		
		
		while(intListiterator.hasNext()) {
			
			 Integer value = intListiterator.next();
			 System.out.println("value present "+value);
			 if(value==5) {
				 integerList.remove(1);	 
				 
			 }
			
		}
		
		
		
		
		
		
	}

}
