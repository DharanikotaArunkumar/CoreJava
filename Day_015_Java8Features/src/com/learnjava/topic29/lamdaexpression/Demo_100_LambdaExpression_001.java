package com.learnjava.topic29.lamdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo_100_LambdaExpression_001 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(200, 400, 700, 300,100,900,500,600,800,1000);
		Collections.sort(list, new Comparator<Integer>() {
		    @Override
		    public int compare(Integer value1, Integer value2) {
		        return value1.compareTo(value2);
		    }
		});
		
		
		System.out.println("Values after sorting : "+list);

	}

}
