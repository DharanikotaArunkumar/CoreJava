package com.learnjava.topic8.controlstatements.demo7.continueandbreak;

public class Demo_082_Continue{

	public static void main(String[] args) {
		// Continue is used to next iteration of the loop .
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				continue;
				
			}
			System.out.println(i + " is odd number");
		}

		//continue applicable for the next only one loop 
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					continue;
				}
				System.out.println("Inside j loop and value i is " + i+"j is "+j);

			}
			
		}
	}

}
