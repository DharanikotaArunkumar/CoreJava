package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_088_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		do{
			int j=0;
			do{
				System.out.println("value of j "+j);
				j++;
			}while(j<10);
			
			System.out.println("value of i "+i);
			i++;
		}while(i<10);

	}

}
