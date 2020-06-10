package com.learnjava.topic25.list;
/*
// How list is grow able
initalcapacity =10, load factor is =1 
capacity =(capacity+(capacity*loadfactor));
*/
import java.util.ArrayList;

public class Demo_212_List_013 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("List Size is :- "+list.size());
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(3); 
		System.out.println("List Size is :- "+list.size());
		
		System.out.println(list);
		list.ensureCapacity(100);// i can set the initial capacity 
		System.out.println(list);
		System.out.println("List Size is :- "+list.size());
		
		
		
	}

}
