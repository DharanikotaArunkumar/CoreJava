/*
 * The Java Predicate interface, java.util.function.Predicate, represents a simple function that takes a single value as parameter, and returns true or false
 * */

package com.learnjava.topic38.lambdaexpression;

import java.util.function.Predicate;

public class Demo_LambdaExpression_314_Predicate {

	public static void main(String[] args) {

		System.out.println("Is 2 even number ? " + new EvenPredicate().test(2));

		System.out.println("Is 3 even number ? " + new EvenPredicate().test(3));

	}

}

class EvenPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {

		return number % 2 == 0;
	}

}