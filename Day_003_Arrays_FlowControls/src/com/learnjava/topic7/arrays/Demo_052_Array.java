package com.learnjava.topic7.arrays;

public class Demo_052_Array {

	public static void main(String[] args) {
		// Declarations, Assignment, Initialization 
		
		int[] sample = new int[10];
		
		int[] numberFilm = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int[] rows = {1,2,3,4,5,6,7,8,9,10}; 

		System.out.println("Dispalying value of numberFilm array ");
		for(int no=0;no<10;no++){
			System.out.print(numberFilm[no]);
		}
		
		System.out.println("\n\nDispalying value of rows array ");
		for(int row=0;row<rows.length;row++){
			System.out.print(rows[row]);
		}
		
		// using for each loop 

		System.out.println("\n\nDispalying value of rows array  by using the for each loop");
		
		for( int row:rows){
			System.out.println(row);
		}
		
		
		
	}

}
