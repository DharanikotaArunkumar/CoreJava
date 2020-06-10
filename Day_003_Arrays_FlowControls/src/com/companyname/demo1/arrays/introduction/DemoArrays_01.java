package com.companyname.demo1.arrays.introduction;

public class DemoArrays_01 {

	public static void main(String[] args) {
		
		// Array Declaration 

		int[] number; // Recommended , Its similar to data type and identifier notation .  like int sum ;.
		int studentsMarks[];
		float []itemPrices;
		char [] filmRows;
		//int[5] sum ;// Wrong...Because declaration is does not meant for size . 
		
		
		//Assignment 
		
		number = new int[5];
		studentsMarks= new int[6];
		itemPrices = new float[3];
		filmRows = new char[10];
		
		
		//Initialization 
		number[0] = 1;
		number[1] =	2;
		number[2] = 3;
		number[3] =	4;
		number[4] = 5;
		
		studentsMarks[0] = 86;
		studentsMarks[1] = 65;
		studentsMarks[2] = 77;
		studentsMarks[3] = 35;
		studentsMarks[4] = 53;
		studentsMarks[5] = 94;
		
		itemPrices[0] = 12.23f;
		itemPrices[1] = 22.53f;
		itemPrices[2] = 67.12f;
		
		filmRows[0] = 'A';
		filmRows[1] = 'B';
		filmRows[2] = 'C';
		filmRows[3] = 'D';
		filmRows[4] = 'E';
		filmRows[5] = 'F';
		filmRows[6] = 'G';
		filmRows[7] = 'H';
		filmRows[8] = 'I';
		filmRows[9] = 'J';
		
		// Displaying arrays values 
		
		System.out.print("Dispalying Array values of number :- ");
		for(int index =0; index<5; index++){
			System.out.println(number[index]);
		}
		
		System.out.println(" \n\nDispalying Array values of StudentMarks :- ");
		for(int stdMark =0; stdMark<5; stdMark++){
			System.out.println(" Index:-"+stdMark+" Values :- "+studentsMarks[stdMark]);
		}
		

		System.out.println(" \nDispalying Array values of itemPrices :- ");
		for(int item =0; item<3; item++){
			System.out.println(" Index:-"+item+" Values :- "+itemPrices[item]);
		}
		

		System.out.println(" \nDispalying Array values of filmRows :- ");
		for(int row =0; row<10; row++){
			System.out.println(" Index:-"+row+" Values :- "+filmRows[row]);
		}

	
	}

}
