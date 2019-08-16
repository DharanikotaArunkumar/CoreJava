package com.companyname.democollections;

// map should have unique key ,if we give another key , latest value will be updated .
// values can be duplicated 

import java.util.HashMap;
import java.util.Map;

public class Demo_Map_4 {

	public static void main(String[] args) {
Map map =new HashMap();
		
map.put(1, "A");
map.put(2, "B");
map.put(3, "C");
map.put(4, "D");
map.put(5, "E");
map.put(6, "F");
System.out.println(map);
map.put(6, "D");

		System.out.println(map);
	}

}
