/*
 * terminal Operator sum
 * 
 * 
 * Returns the maximum element of this stream according to the provided
     * {@code Comparator}. */

package com.learnjava.topic39.streams.terminal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo_Streams_330_Terminal_Collect {

	public static void main(String[] args) {

		// Collecting to Set
		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj","Suraj", "Swaraj");

		Set<String> nameSet = names.filter(s -> s.startsWith("S")).collect(Collectors.toSet());

		System.out.println(nameSet);

		// Collecting to List
		names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj","Suraj", "Swaraj");

		List<String> nameList = names.filter(s -> s.startsWith("S")).collect(Collectors.toList());

		System.out.println(nameList);

		// Collecting to Specific set
		names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		TreeSet<String> nameTreeSet = names.collect(Collectors.toCollection(TreeSet::new));

		System.out.println(nameTreeSet);

		// Collecting to Specific list
		names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		LinkedList<String> nameLinkedList = names.collect(Collectors.toCollection(LinkedList::new));

		System.out.println(nameLinkedList);

		// Collecting to Array

		names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		String[] namesArray = names.toArray(String[]::new);

		System.out.println(Arrays.toString(namesArray));
		
		// Collecting to Map
		
		names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		Map<String,Integer> wordCount= names.distinct().collect(Collectors.toMap(Function.identity(),s -> (int) s.chars().distinct().count()));
		
		wordCount.forEach((k,v) ->System.out.println(k+"->"+v));
		

	}

}
