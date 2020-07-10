/*
 * terminal Operator count
 * 
 * 
 *Returns the count of elements in this stream. 
 **/

package com.learnjava.topic39.streams.terminal;

import java.util.stream.Stream;

public class Demo_Streams_326_Terminal_Count {

	public static void main(String[] args) {

		
		////collection.stream().intermediate().<intermediate()>.<intermediate()>.terminal()

		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		long noOfNames = names.filter(s -> s.startsWith("S")).count();

		System.out.println(" No of names in the stream " + noOfNames);

		Stream<String> namesStream = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		// we can apply terminal operations directly on streams .
		noOfNames = namesStream.count();

		System.out.println(" No of names in the stream " + noOfNames);
	}

}
