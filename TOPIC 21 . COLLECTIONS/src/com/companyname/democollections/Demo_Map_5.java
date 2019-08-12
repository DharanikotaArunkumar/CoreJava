package com.companyname.democollections;

import java.util.HashMap;
import java.util.Map;

public class Demo_Map_5 {

	public static void main(String[] args) {
		Map map =new HashMap();
		
		map.put(null, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(null, "D");

				System.out.println(map);
	}

}
