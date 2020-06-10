package com.learnjava.topic7.arrays.selfstudy;

// Lets write a program to find the average temperature .maximum and minimum of a week  .
public class Demo_062_Array {

	public static void main(String[] args) {
	
		float[] weekTemp = new float[] {35.7F,41.3F,32.8F,31.4F,33.1F,42.9F,35.7F};
		float sum =0;
		
		for(float day:weekTemp){ // for( int index=0;index<weektemp.length;index++)
			sum =sum+day;
		}		
		System.out.println("Average Temperature :- " +sum/weekTemp.length);
		
		float minTemp = weekTemp[0];
		for(float day:weekTemp){
			if(minTemp>day){
				minTemp = day;
			}
		}		
		System.out.println("Minimum Temperature :- " +minTemp);
		
		float maxTemp = weekTemp[0];
		for(float day:weekTemp){
			if(maxTemp<day){
				maxTemp = day;
			}
		}		
		System.out.println("Maximum Temperature :- " +maxTemp);
		
		
	}

}
