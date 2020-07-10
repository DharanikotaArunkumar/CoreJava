/*
 * for each for map , and example of bi consumer .
 * */

package com.learnjava.topic38.lambdaexpression;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Demo_LambdaExpression_313_ForEach_Map {

	public static void main(String[] args) {
		Map<String, String> nationAndCapitalCity = new HashMap<String,String>();
		
		nationAndCapitalCity.put("INDIA","DELHI");
		
		nationAndCapitalCity.put("AFGHANISTAN","KABUL");
		
		nationAndCapitalCity.put("CHINA","BEIJING");
		
		nationAndCapitalCity.put("CANADA","OTTAWA");
		  
		//nationAndCapitalCity.forEach(new MyBiConsumer());
		 
		nationAndCapitalCity.forEach((country,capitalCity)-> System.out.println("Country : "+country +" and capital city "+capitalCity));
	}

}

class MyBiConsumer implements BiConsumer<String,String> {

	@Override
	public void accept(String country, String capitalCity) {
		System.out.println("Country : "+country +" and capital city "+capitalCity);
		
	}

	

}