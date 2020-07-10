/*
 * for each been introduced in collection interface And example of consumer
 * */


package com.learnjava.topic38.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo_LambdaExpression_312_ForEach_List {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		nameList.add("Vijay");
		nameList.add("Ajay");
		nameList.add("Suresh");
		
		//nameList.forEach(new MyConsumer());
		
		// nameList.forEach((name)-> System.out.println(name));
		
		nameList.forEach(System.out::println);
		
	}
	
	

}


/*class Myconsumer implements Consumer<String>{

	@Override
	public void accept(String name) {
		System.out.println(name);
		
	}
	
}*/


class MyConsumer implements Consumer<String>{

	@Override
	public void accept(String name) {
	System.out.println(name);
		
	}
	
}