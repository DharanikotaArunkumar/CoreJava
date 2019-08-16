package com.companyname.democollections;
// linked list example 
import java.util.LinkedList;

public class Demo_LinkedList_1 {

	public static void main(String[] args) {
		LinkedList<Object> list =new LinkedList<Object>();
		list.addFirst("1");
		list.add("2");
		list.addLast("3");
		System.out.println(list);
		list.addFirst("0");
		System.out.println(list);
		list.addLast("4");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		

	}

}
