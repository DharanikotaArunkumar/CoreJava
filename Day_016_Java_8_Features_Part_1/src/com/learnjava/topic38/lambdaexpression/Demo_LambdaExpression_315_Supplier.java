/*
 * The Java Supplier interface is a functional interface that represents an function that supplies a value
 * */

package com.learnjava.topic38.lambdaexpression;

import java.util.function.Supplier;

public class Demo_LambdaExpression_315_Supplier {

	public static void main(String[] args) {

		System.out.println("get random number " + new MyRandomSupplier().get());

		Supplier<Integer>  supplier = () -> {return new Integer((int) (Math.random() * 1000));};
	
		System.out.println("get random numberfrom lambda "+ supplier.get());
	
	}

}

class MyRandomSupplier implements Supplier<Integer> {

	@Override
	public Integer get() {

		return new Integer((int) (Math.random() * 1000));
	}

}