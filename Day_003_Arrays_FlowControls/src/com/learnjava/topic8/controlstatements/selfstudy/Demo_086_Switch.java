package com.learnjava.topic8.controlstatements.selfstudy;

public class Demo_086_Switch {

	
	public static void main(String[] args) {
		// 1) Empty Switch is valid, But no in real time
		int i=1;
		switch(i){			
		}
		
		// 2) switch should not contain any individual statements 
		
		/*int ii=0;
		switch(ii){	
		System.out.println("i am invalide here");		
		}*/
		
		// 3) Switch argument ,case should contains constant value only .
		
		int choice=10;
		
		
		switch(choice-1){	
		case 0:
			System.out.println("I am constant ");
			break;
		case 2+3+5+1:
			System.out.println("I am constant ");
			break;
		case 2:
			System.out.println("Do not change me ..i want to be constant always ");
			break;		
		}
		
		//4) if your defining the byte data type switch argument then all the case should in the range of that 
		
		
		/*byte choice=12;
		
		switch(choice){	
		case 0:
			System.out.println("I am constant ");
			break;
		case 12:
			System.out.println("I am constant ");
			break;
		case 130:
			System.out.println("Do not change me ..i want to be constant always ");
			break;		
		}*/
		
		
		//5)Duplicates are not allowed 
		
	/*	byte choice=12;
		
		switch(choice){	
		case 0:
			System.out.println("I am constant ");
			break;
		case 12:
			System.out.println("I am constant ");
			break;
		case 12:
			System.out.println("Do not change me ..i want to be constant always ");
			break;		
		}*/
		
		
		//6) Default case can be written any where but its executes only if matches not found
		
		/* choice=13;
		
		switch(choice){	
		default :
			System.out.println("i am fine here");
			break;
		case 0:
			System.out.println("I am constant ");
			break;
		case 12:
			System.out.println("I am constant ");
			break;
		case 14:
			System.out.println("Do not change me ..i want to be constant always ");
			break;		
		}
		*/
	}

}
