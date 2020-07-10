package com.learnjava.topic27.set;


// How to remove the duplicates from the collections
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo_Set_7 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		Set set =new HashSet();
		set.addAll(list);
		
		
		
	
		System.out.println(set);
		System.out.println(list);
		
		
		List uniqueList = new ArrayList();
		uniqueList.addAll(set);
		
		System.out.println(uniqueList);
		
		

	}

}
