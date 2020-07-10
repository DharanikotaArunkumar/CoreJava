/*
 * Intermediate Operator distinct
 * 
 * 
 *Returns a stream consisting of the distinct elements 	of this stream.
 */

package com.learnjava.topic39.streams.intermediate;

import java.util.stream.Stream;

public class Demo_Streams_321_Intermediate_Distinct {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay","Suraj", "Raj", "Suraj", "Swaraj");

		names = names.filter(s -> s.startsWith("S")).distinct();

		names.forEach(System.out::println);

	}

}
