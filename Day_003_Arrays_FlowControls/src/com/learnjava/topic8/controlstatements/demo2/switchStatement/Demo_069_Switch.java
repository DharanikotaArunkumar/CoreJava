package com.learnjava.topic8.controlstatements.demo2.switchStatement;

public class Demo_069_Switch {

	public static void main(String[] args) {
		
		// When we have more selection options we need to go for switch
		
		int choice  = 4;
		long startTIme = System.currentTimeMillis();
		
		
		switch(choice){		
		case 1: 
			System.out.println("You have choosen Case1");
		case 2:
			System.out.println("You have choosen Case2");
		case 3:
			System.out.println("You have choosen Case3");
		case 4:
			System.out.println("You have choosen Case4");
		case 5:
			System.out.println("You have choosen Case5");
			
		
		}
		
		
		/*if(choice==1){
			System.out.println("You have choosen Case1");
		}else if(choice==2){
			System.out.println("You have choosen Case2");
		}else if (choice==3){
			System.out.println("You have choosen Case3");
		}else if (choice==4){
			System.out.println("You have choosen Case4");
		}else if (choice==5) {
			System.out.println("You have choosen Case4");
		}else{
			System.out.println("no choice");
		}
		*/
		 long endTime = System.currentTimeMillis();
		 
			long timeDiff = endTime-startTIme;
			System.err.println(timeDiff);
		
	}
	

}
