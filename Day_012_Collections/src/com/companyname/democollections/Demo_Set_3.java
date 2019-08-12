package com.companyname.democollections;

import java.util.HashSet;
import java.util.Set;

// Hash set allows null
public class Demo_Set_3 {

	public static void main(String[] args) {
		Set<Object> set =new HashSet<Object>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		System.out.println(set);
		set.add(null);
		System.out.println(set);
		set.add(null);
		set.add("null");
		set.add("null");
		
		System.out.println(set);
	}

}
