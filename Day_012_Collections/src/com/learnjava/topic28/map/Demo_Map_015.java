package com.learnjava.topic28.map;

// tree map example 

import java.util.Map;
import java.util.TreeMap;

public class Demo_Map_015 {

	public static void main(String[] args) {
		Map map =new TreeMap();
		map.put(1, "A");
		map.put(34, "B");
		map.put(3, "C");
		map.put(35, "D");
		map.put(5, "E");
		map.put(6, "F");
		
		System.out.println(map);}

}
