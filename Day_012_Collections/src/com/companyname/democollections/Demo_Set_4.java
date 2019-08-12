package com.companyname.democollections;
// we can not add any element in middle of a set or any location specific insertion and deletion will not
//be possible Ex add(index,Object) ,remove (index) 

import java.util.HashSet;
import java.util.Set;

public class Demo_Set_4 {

	public static void main(String[] args) {
		Set<Object> set =new HashSet<Object>();
		set.add("A");
		set.add("hello");
		set.add("B");
		set.add("a");
		set.add("D");
		set.add("b");
		set.add("F");
		
	
		System.out.println(set);}

}
