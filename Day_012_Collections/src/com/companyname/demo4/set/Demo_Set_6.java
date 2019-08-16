package com.companyname.democollections;

// If you want the data elements to be in the ordered then we have TreeSet .
import java.util.Set;
import java.util.TreeSet;

public class Demo_Set_6 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		//set.add(null);
		set.add(5);
		set.add(6);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
	System.out.println(set);	
	}

}
