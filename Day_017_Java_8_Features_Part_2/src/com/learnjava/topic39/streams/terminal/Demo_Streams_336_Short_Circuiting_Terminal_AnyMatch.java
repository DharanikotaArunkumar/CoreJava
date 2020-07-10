/*
 * short circuiting terminal Operator findAny
 * 
 *  short-circuiting terminal operation, when operating on infinite input data source, may terminate in finite time.
 * 
 * 
 *Returns an {@link Optional} describing the first element of this stream,
     * or an empty {@code Optional} if the stream is empty.  If the stream has
     * no encounter order, then any element may be returned.*/

package com.learnjava.topic39.streams.terminal;

import java.util.stream.Stream;

public class Demo_Streams_336_Short_Circuiting_Terminal_AnyMatch {

	public static void main(String[] args) {

		// Grouping by starting letter
		Stream<String> names = Stream.of("Vijay", "Ajay", "Jay", "Raj", "Suraj", "Swaraj");

		boolean isMatched = names.anyMatch(s -> s.length() > 0 &&  Character.isUpperCase(s.charAt(0)));

		System.out.println(isMatched);

	}

}
