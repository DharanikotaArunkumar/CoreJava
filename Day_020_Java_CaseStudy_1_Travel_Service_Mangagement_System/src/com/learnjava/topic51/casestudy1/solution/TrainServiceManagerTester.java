package com.learnjava.topic51.casestudy1.solution;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class TrainServiceManagerTester {

	public static void main(String[] args) throws Exception {

		TrainServiceManagerSolution trainservice = new TrainServiceManagerSolution();
		// Please create this file as mentioned in case study document in your location and change file path pointing to that location  
		String filePath = "E:\\Java Training\\13_COMPLETE JAVA\\CompleteJavaCourse\\WEEK 4. Case Study - Self\\TrainRoutesandFares.dat"; 
		
		
		/*Requirement 1:- Given the source station number, destination station number and date of travel as input, the application 
		should return all the train details which is running strictly from the source to the destination stations and not the trains passing through the stations.*/
		
		List<TrainDetailsVO> trainList = trainservice.getTrainDetails(filePath, 11,17, "22-08-2020");
		if(trainList.isEmpty()){
			System.out.println("No Train Found ...!!!");
		}
		else{
			System.out.println("List of Train Detailes :-  "+trainList);
		}
			
		//Requirement 2:- This is to return all the train details running only on Sundays

		Map<Integer,TreeSet<Integer>> specialTrains=	trainservice.getTrainSchedule(filePath);
		
		if(specialTrains.isEmpty()){
			System.out.println("No Special Trains Found ");
		}
		else{
			System.out.println("Special Trains Nos " +specialTrains.get(1));
		}
		
	}

}
