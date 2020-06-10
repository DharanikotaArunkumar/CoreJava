package com.learnjava.topic27.set;
//Set example :- Duplicates are not allowed .

import java.util.HashSet;
import java.util.Set;

public class Demo_Set_1 {

	public static void main(String[] args) {
	Set<Object> set =new HashSet<Object>();
	set.add("A");
	set.add("B");
	set.add("C");
	set.add("D");
	set.add("E");
	set.add("F");
	System.out.println(set);
	set.add("A");
	
	System.out.println(set);

	}

}
