package com.companyname.democollections;


// LinkedHashMap follows the inertion order .
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo_Map_13 {

	public static void main(String[] args) {
		Map map =new HashMap();
		map.put(1, "A");
		map.put(34, "B");
		map.put(3, "C");
		map.put(35, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(null, "D");
		System.out.println(map);
		
		Map map1 =new LinkedHashMap();
		map1.put(1, "A");
		map1.put(34, "B");
		map1.put(3, "C");
		map1.put(35, "D");
		map1.put(5, "E");
		map1.put(6, "F");
		map1.put(null, "D");
		System.out.println(map1);
		
		
	}

}
