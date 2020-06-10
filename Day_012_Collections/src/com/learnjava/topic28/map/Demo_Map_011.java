package com.learnjava.topic28.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// How to print all values 

public class Demo_Map_011 {

	public static void main(String[] args) {
Map map =new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(null, "D");
		System.out.println(map.isEmpty());
		Set set =map.keySet();
		System.out.println(set);
		
	System.out.println(map.values());
	}

}
