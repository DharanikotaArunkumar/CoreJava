package com.companyname.democollections;

// isEmpty() and clear() methods of the map

import java.util.HashMap;
import java.util.Map;

public class Demo_Map_8 {

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
		map.clear();
		System.out.println(map.isEmpty());
		}

}
