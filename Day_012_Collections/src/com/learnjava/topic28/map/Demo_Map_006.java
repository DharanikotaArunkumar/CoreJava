package com.companyname.democollections;

import java.util.HashMap;
import java.util.Map;

// get() is used to get the value of that particular key .
// and the return type is Object 
public class Demo_Map_6 {

	public static void main(String[] args) {
		Map map =new HashMap();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(null, "D");
		

				System.out.println(map.get(1));
				System.out.println(map.get(null));
	}

}
