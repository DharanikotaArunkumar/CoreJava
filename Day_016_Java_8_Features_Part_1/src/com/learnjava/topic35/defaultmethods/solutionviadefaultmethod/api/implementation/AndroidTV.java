package com.learnjava.topic35.defaultmethods.solutionviadefaultmethod.api.implementation;

import com.learnjava.topic35.defaultmethods.problem.api.DeviceAPI;
import com.learnjava.topic35.defaultmethods.solution.api.AbstractDevice;

public class AndroidTV extends AbstractDevice implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "Android";
	}

	@Override
	public String getMaxResolution() {
		
		return "5280";
	}

	@Override
	public String getBrand() {
		
		return "Samsung";
	}
	
	@Override
	public boolean isBlueToothEnabled() {

		return false;
	}

}
