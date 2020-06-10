package com.learnjava.topic51.casestudy1;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public interface TrainServiceManager {

	/*Given the source station number, destination station number and date of travel as input, the application should 
	 * return all the train details which is running strictly from the source to the destination stations and not the 
	 * trains passing through the stations. Also note that only special train runs on Sundays also. Other trains runs
	 *  only From Monday to Saturday.
	 */
	
	public List<TrainDetailsVO> getTrainDetails(final String filePath, int source, int destination, String dateOfTravel)
			throws TrainServiceException;

	/*  Requirement 2:- Solution Return the special trains */
	
	public Map<Integer, TreeSet<Integer>> getTrainSchedule(String filePath)
			throws TrainServiceException;

}
