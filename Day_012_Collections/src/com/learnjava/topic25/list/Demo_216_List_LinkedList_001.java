package com.learnjava.topic25.list;
/*
 * Linked List Example 
 * 
 * => Its a Linear data structure where data is not stored continuously locations .
 * => Each Element is stored as Node . Node contains 2 parts 1) value 2) link to next node .
 * => Order is preserved . As iterator travel though one node to next node .
 * => Good for frequent insertion and deletion .
 * => 
 */
import java.util.LinkedList;
import java.util.List;

public class Demo_216_List_LinkedList_001 {

	public static void main(String[] args) {
		
		List<Integer> linkedlist =new LinkedList<Integer>();
		
		linkedlist.add(100);
		linkedlist.add(200);
		linkedlist.add(300);
		linkedlist.add(400);
		linkedlist.add(500);
		linkedlist.add(600);
		linkedlist.add(700);
		
		System.out.println("List of elements present in the linked list :-  "+linkedlist);
	}

}
