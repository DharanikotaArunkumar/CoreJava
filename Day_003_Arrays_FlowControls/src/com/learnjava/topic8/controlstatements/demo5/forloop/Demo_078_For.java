package com.learnjava.topic8.controlstatements.demo5.forloop;

public class Demo_078_For {

	public static void main(String[] args) {
		
		//1) We can have multiple inilization blocks in for loop of type same only 
		// int i=0,String name="hello"; or int i=0;int j =0; is invalid
		
		for(int i=0,j=1;i<10;i++,j++){
			System.out.println("value of i is "+i+" value of j is "+j);
		}

		//2) we can take any valid java statement in the inlization section 
		int i =0,j=0;
		for(j=23+34;i<3;i++)
		{
			System.out.println("value of i ,j "+i+","+j);
		}
		
		//3) we can take any valid java statement in the increament section 
				
				for(int ii=0,jj=1;ii<10;jj=34+45)
				{
					ii++;
					jj++;
					System.out.println("value of i ,j "+ii+","+jj);
				}
				
				//4) conditional statements expects boolean as return
				
				for(int ii=0,jj=1;ii<10;jj=34+45)
				{
					ii++;
					jj++;
					System.out.println("value of i ,j "+ii+","+jj);
				}
				//5) all blocks in for loop is optional
				
				for(;;)
				{
					
				}
		
	}
	

}
