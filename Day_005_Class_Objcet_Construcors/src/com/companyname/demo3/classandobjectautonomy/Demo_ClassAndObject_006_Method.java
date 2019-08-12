package com.companyname.demo3.classandobjectautonomy;

/*
 * Sending the arguments to method and returning the value from the method .
 */

public class Demo_ClassAndObject_006_Method {	
		
		public static void main(String[] args) {
			
			float avgValue =calculateAverage(1,2,3);
			System.out.println("AverageValue of 3 numbers is :- "+avgValue);
			
			int maxValue =getMaxNumber(1,2,3);
			System.out.println("getMaxNumber :- "+maxValue);
			
			avgValue =calculateAverage(1,1,1);
			System.out.println("AverageValue of 3 numbers is :- "+avgValue);
			
			maxValue =getMaxNumber(1,1,1);
			System.out.println("getMaxNumber :- "+maxValue);



		}
		
		static float calculateAverage(int number1,int number2,int number3)  
		{			
			float value = (number1+number2+number3)/3; 
			return value;
		}


		static int getMaxNumber(int number1,int number2,int number3)  
		{
			int maxValue;
			if(number1>number2 && number1>number3){
				maxValue =number1;
			}else if(number2>number1 && number2>number3){
				maxValue =number2;
			}else if(number3>number1 && number3>number2) {
				maxValue =number3;
			}else{
				maxValue =number1;
				System.out.println("All are equal");
			}
			return maxValue;
		}

	

}
