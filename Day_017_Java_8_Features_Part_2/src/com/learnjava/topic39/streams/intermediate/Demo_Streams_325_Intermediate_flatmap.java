/*
 * Intermediate Operator flat map
 * 
 * The flatMap() method first flattens the input Stream of Streams to a Stream of Strings
 * 
 * 
 * 
 It is related to the map() operation but instead of taking a Function that goes from a type T to a return type R,
  it takes a Function that goes from a type T and returns a Stream of R.
   These "internal" streams are then flattened out to the resulting streams, resulting in a concatenation of all the elements of the internal streams.
 */

package com.learnjava.topic39.streams.intermediate;

import java.util.stream.Stream;

public class Demo_Streams_325_Intermediate_flatmap {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Suraj", "Raj", "Suraj", "Swaraj");

		Stream<Character> nameChar = names.flatMap(nm -> nm.chars().mapToObj(i -> (char) i));
		nameChar.forEach(System.out::println);

	}

}
