/*
 * lambda Expression which has the return value sum
 */

package com.learnjava.topic38.lambdaexpression;

@FunctionalInterface
interface AdditionInterface {

	int add(int number1, int number2);

}

public class Demo_LambdaExpression_311_AddtionInterface {

	public static void main(String[] args) {

		AdditionInterface additionInterface = (int number1, int number2) -> {
			return number1 + number2;
		};

		int sum = additionInterface.add(10, 10);

		System.out.println(sum);

	}

}
