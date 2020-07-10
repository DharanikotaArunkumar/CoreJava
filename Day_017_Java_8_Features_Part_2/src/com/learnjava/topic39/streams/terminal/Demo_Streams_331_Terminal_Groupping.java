/*
 * terminal Operator Group
 * 
 * 
 * Returns the maximum element of this stream according to the provided
     * {@code Comparator}. */

package com.learnjava.topic39.streams.terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo_Streams_331_Terminal_Groupping {

	public static void main(String[] args) {

		// Grouping by starting letter
		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay","Jayakar", "Raj", "Suraj", "Swaraj");

		Map<Character, List<String>> groupingByList = names.collect(Collectors.groupingBy(name -> name.charAt(0)));

		groupingByList.forEach((k, v) -> System.out.println(k + "->" + v));

		System.out.println("--------------------------------------");
		// Grouping by last letter
		names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		Map<Character, List<String>> groupingByLast = names
				.collect(Collectors.groupingBy(name -> name.charAt(name.length() - 1)));

		groupingByLast.forEach((k, v) -> System.out.println(k + "->" + v));

		System.out.println("--------------------------------------");

	}

}
