package com.companyname.democollections;
/*
// How list is grow able
initalcapacity =10, load factor is =1 
capacity =(capacity+(capacity*loadfactor));
*/
import java.util.ArrayList;

public class Demo_List_13 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(3); 
		System.out.println(list);
		list.ensureCapacity(100);// i can set the inital capacity 
		System.out.println(list);
		
		
		
	}

}
