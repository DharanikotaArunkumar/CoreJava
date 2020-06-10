package com.learnjava.topic35.defaultmethods.solution.api.implementation;

import com.learnjava.topic35.defaultmethods.problem.api.DeviceAPI;
import com.learnjava.topic35.defaultmethods.solution.api.AbstractDevice;

public class SmartWatch extends AbstractDevice implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "watchOS";
	}

	@Override
	public String getMaxResolution() {
		
		return "192";
	}

	@Override
	public String getBrand() {
		
		return "Apple";
	}

}
