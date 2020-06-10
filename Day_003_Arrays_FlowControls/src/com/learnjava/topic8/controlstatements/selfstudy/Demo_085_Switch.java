package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_085_Switch {

	public static void main(String[] args) {
		// switch allows byte,short,char,int,String,enum and maximum 2^4(2147483647). it means we can those many 
		// Selection cases 
		int ch=2;
		switch(ch){
		
		case -2147483648 :
			System.out.println("i am allowed till here on -ve side");
			break;
		case 2147483647 :
			System.out.println("i am allowed till here on +ve side");
			break;
		case 1+5-4:
		System.out.println("sai");
		break;
		/*case 2147483648 :	
			System.out.println("Switch says :- I can not take this value ....Sorry");
			break;*/
		
		}

	}

}
