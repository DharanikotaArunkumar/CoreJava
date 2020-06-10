package com.companyname.demo8.foreach;

import java.util.ArrayList;
import java.util.List;

public class Demo_For_Each_1 {

	public static void main(String[] args) {
		
		
		// Foreach loop is specially designed for the arrays and collections .
		// its Recommend among the all loops ,because its take care about condition checking and inlization increment
		
		// single dimensional Array retrieval

				String[] day = new String[7];
				day[0] = "sun";
				day[1] = "mon";
				day[2] = "tue";
				day[3] = "wed";
				day[4] = "thr";
				day[5] = "fri";
				day[6] = "sat";
				System.out.println(" Days in a Week ");

				for (String value :day) {
					System.out.println(value);
				}
				
				
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hi");
		list.add("hey");
		list.add("bye");
		
		for(String value :list){			
			System.out.println(value);
			
		}

		
	}

}
