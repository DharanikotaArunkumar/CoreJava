package com.companyname.democollections;

// all the keys should be in comparing form
import java.util.Map;
import java.util.TreeMap;

public class Demo_Map_16 {

	public static void main(String[] args) {
		Map map =new TreeMap();
		map.put(1, "A");
		map.put(34, "B");
		map.put(3, "C");
		map.put(35, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(null, "D");
		System.out.println(map);}

}
