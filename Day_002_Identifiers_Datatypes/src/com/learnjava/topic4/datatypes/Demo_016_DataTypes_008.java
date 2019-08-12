package com.learnjava.topic4.datatypes;

public class Demo_016_DataTypes_008 {

	public static void main(String[] args) {

		/*
		 * char size :- 2 Byte Range :- '\u0000'(0) to '\uffff'  (65,535)
		 */
		char result = 'P';
		System.out.println(result);

		// Representation of the character directly
		char character = 'Z';
		System.out.println(character);

		// Representation of the character by number
		char firstCharacter = (char) 0;
		System.out.println(firstCharacter);

		// Representation of the character by number
		char lastCharacter = (char) 65535;
		System.out.println(lastCharacter);

		// Representation of the character by number
		char hindiCharacter = (char) 2309;
		System.out.println(hindiCharacter);

		// Goto Run symbol --> Run Configurations --> select common tab -->
		// change is encoding format to UTF -8

		// Displaying English Capital Characters
		for (int k = 65; k <= 90; k++) {
			System.out.print((char) k + " ");
		}
		System.out.println();

		// Displaying English small Characters
		for (int k = 97; k <= 122; k++) {
			System.out.print((char) k + " ");
		}
		System.out.println();

		// Displaying Hindi Characters
		for (int k = 2309; k <= 2360; k++) {
			System.out.print((char) k + " ");
		}
		System.out.println();

		// Displaying Bengali Characters
		for (int k = 2437; k <= 2519; k++) {
			System.out.print((char) k + " ");
		}
		System.out.println();

		// Displaying Telugu Characters
		for (int k = 3077; k <= 3183; k++) {
			System.out.print((char) k + " ");
		}

		System.out.println();
		// Displaying Tamil Characters
		for (int k = 2949; k <= 3066; k++) {
			System.out.print((char) k + " ");
		}

		System.out.println();

		// Displaying All Characters


	 for (int k = 0; k <= 65535; k++) { 
		 System.out.println((char) k + " "); 
	 }
		// if all characters are not displayed increase the console size

	}

}
