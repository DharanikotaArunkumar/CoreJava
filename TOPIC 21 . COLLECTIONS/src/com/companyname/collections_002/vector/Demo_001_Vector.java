/*
 * The vector class implements a grow able array of  objects. Like an array.
 */

package com.companyname.collections_002.vector;

import java.util.Vector;

public class Demo_001_Vector {

	public static void main(String[] args) {
		
		
		Vector luckeyDrawTickets = new Vector(); // stores the all lucky draw tickets
		
		// To add elements into vector we have a method called add.
		
		
		luckeyDrawTickets.add(1001);
		luckeyDrawTickets.add(1002);
		luckeyDrawTickets.add(1003);
		luckeyDrawTickets.add(1004);
		luckeyDrawTickets.add(1005);
		
		// Like length attribute present in arrays . We have size() to know the vector size
		
		System.out.println("Size of Vector after adding 5 elements :- "+luckeyDrawTickets.size());
		
		luckeyDrawTickets.add(1006);
		luckeyDrawTickets.add(1007);
		luckeyDrawTickets.add(1008);
		luckeyDrawTickets.add(1009);
		luckeyDrawTickets.add(1010);
		
		System.out.println("Size of Vector after adding 10 elements :- "+luckeyDrawTickets.size());
		
		System.out.println(" This concludes Vector is growable in size like array .");
		
		
		
		
		

	}

}
