package com.companyname.demoexceptions;

/*Exception Flow 

1) When abnormal situation occurs then it identifies the corresponding class and object will be created .
2) Checks weathers the corresponding exception been handled .else it will terminate the execution .
3) Exceptions which are handled will be executed and rest of the flow continues */

public class Demo_Exceptions_003 {

	public static void main(String[] args) {
		
		System.out.println("Program Started ");
		int[] array = new int[5];
		for (int i=0 ;i<6;i++){
			System.out.println("Values Of array "+array[i]);
		}
		System.out.println("Program Ended succesfully");
	}

}
