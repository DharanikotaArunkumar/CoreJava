package com.learnjava.topic35.defaultmethods.problem.api.implementation;

import com.learnjava.topic35.defaultmethods.problem.api.DeviceAPI;

public class SmartWatch implements DeviceAPI {

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
