package com.learnjava.topic51.casestudy1.solution;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public interface TrainServiceManager {

	public List<TrainDetailsVO> getTrainDetails(final String filePath, int source, int destination, String dateOfTravel)
			throws TrainServiceException;

	public Map<Integer, TreeSet<Integer>> getTrainSchedule(String filePath)
			throws TrainServiceException;

}
