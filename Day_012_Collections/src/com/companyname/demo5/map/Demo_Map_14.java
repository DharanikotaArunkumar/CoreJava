package com.companyname.democollections;

// Is nulls are not allowed in the Hashtable as key and value 

import java.util.Hashtable;
import java.util.Map;

public class Demo_Map_14 {

	public static void main(String[] args) {
		Map map =new Hashtable();
		map.put(1, "A");
		map.put(34, "B");
		map.put(3, "C");
		map.put(35, "D");
		map.put(5, "E");
		map.put(6, "F");
		//map.put(6, null);
		map.put(null, "D");
		System.out.println(map);
	}

}
