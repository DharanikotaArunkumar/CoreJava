package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_089_For {

	public static void main(String[] args) {

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

		for (int i = 0; i < day.length; i++) {
			System.out.println(day[i]);
		}

		// All Array elements will have default 
		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Default Value at int numbers[" + i + "]" + " :" + numbers[i]);
		}
		
		String[] names = new String[5];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Default Value at String name[" + i + "]" + " :" + names[i]);
		}
		
		
		
		// single dimensional Array data insertion		

		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i;
			System.out.println("inserated Value at number[" + i + "]" + " :" + numbers[i]);
		}
	}

}
