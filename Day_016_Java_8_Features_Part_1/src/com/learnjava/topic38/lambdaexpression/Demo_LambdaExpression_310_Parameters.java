/*
 * writing the same method using lambda expression.
 */

package com.learnjava.topic38.lambdaexpression;

@FunctionalInterface
interface SAMInterface {
	//void method1();

	//void method2(String name);

	void method3(String name, String address);

}

public class Demo_LambdaExpression_310_Parameters {

	public static void main(String[] args) {
		
		//SAMInterface samInterface = () -> System.out.println(" Method 1 called");
		//samInterface.method1();

	/*	SAMInterface samInterface = (String name) -> System.out.println(" Method 2 called and the name is "+name);
		
		samInterface.method2("vijay");*/
		
		
		SAMInterface samInterface = (String name,String address) -> System.out.println(" Method 2 called "+name+" address "+address);
		
		samInterface.method3("vijay","india");

	}

}
