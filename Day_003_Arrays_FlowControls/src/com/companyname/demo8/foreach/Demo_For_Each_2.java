package com.companyname.demo8.foreach;

public class Demo_For_Each_2 {

	public static void main(String[] args) {
		
		//1) its appliable only for coolection and array ,not for genral condition checking 
		
		for(int i=0;i<10;i++){
			System.out.println("we can write this code in for each loop");
		}
		
		// 2) we can not write below code in for each loop
				int[] numbers = new int[5];

				for (int i = 0; i < numbers.length; i++) {
					System.out.println("Default Value at int numbers[" + i + "]" + " :" + numbers[i]);
				}
				
				

	}

}
