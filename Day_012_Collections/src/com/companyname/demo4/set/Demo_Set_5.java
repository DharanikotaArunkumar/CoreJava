package com.companyname.democollections;

import java.util.LinkedHashSet;
import java.util.Set;

// If we want the order of the set to be preserved then we should go for the LinkedHashSet .

public class Demo_Set_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set = new LinkedHashSet();
		set.add("A");
		set.add("hello");
		set.add("B");
		set.add("a");
		set.add("D");
		set.add("b");
		set.add("F");
		
	
		System.out.println(set);
		}

}
