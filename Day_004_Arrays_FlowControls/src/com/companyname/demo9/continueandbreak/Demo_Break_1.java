package com.companyname.demo9.continueandbreak;

public class Demo_Break_1 {

	public static void main(String[] args) {
		// break is used to come out of the loop/switch .

		// 1) inside switch to stop execution of next cases.

		char ch = 'a';

		switch (ch) {
		case 'a':
			System.out.println("you have choosen a vowel");
			break;

		case 'e':
			System.out.println("you have choosen e vowel");
			break;

		case 'i':
			System.out.println(" you have choosen i vowel");
			break;

		case 'o':
			System.out.println("you have choosen o vowel");
			break;

		case 'u':
			System.out.println(" you have choosen u vowel");
			break;

		default:
			System.out.println("you have not choosen vowel");
		}

		// 2) in side loop

		for (int i = 1; i <= 100; i++) {
			
			if (i == 50) {
				break;
			}
			System.out.println(i);
		}

		
		//break the particular loop
		for (int i = 0; i < 10; i++) {//outer
			for (int j = 0; j < 10; j++) {//inner
				if (j == 5) {
					break;
				}
				System.out.println("Inside j loop and value i is " + i+"j is "+j);

			}
			
		}
	}

}
