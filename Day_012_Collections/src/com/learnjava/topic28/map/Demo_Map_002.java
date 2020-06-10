package com.learnjava.topic28.map;

// Map accepts any object as key value pair .
import java.util.HashMap;
import java.util.Map;

public class Demo_Map_002 {

	public static void main(String[] args) {
		Map map =new HashMap();
		
		map.put(1, "A");
		map.put("B", "B");
		map.put('c', "C");
		map.put(12.23f, "D");
		map.put(12.345, "E");
		map.put(true , "F");
		System.out.println(map);
	}

}
