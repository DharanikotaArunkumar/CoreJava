package com.learnjava.topic27.set;

import java.util.HashSet;
import java.util.Set;


//insertion ordering its not preserved in the set .
public class Demo_Set_2 {

	public static void main(String[] args) {
		Set<Object> set =new HashSet<Object>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F"); //[A, B, C, D, E, F]
		System.out.println(set);
		set.add("a");
		set.add("b");
		set.add("1");//[A, B, C, D, E, F,a,b,1]
		
		System.out.println(set);
	}

}
