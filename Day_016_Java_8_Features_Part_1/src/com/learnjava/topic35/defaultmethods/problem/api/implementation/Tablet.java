package com.learnjava.topic35.defaultmethods.problem.api.implementation;

import com.learnjava.topic35.defaultmethods.problem.api.DeviceAPI;

public class Tablet implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "Android";
	}

	@Override
	public String getMaxResolution() {
		
		return "768";
	}

	@Override
	public String getBrand() {
		
		return "Samsung";
	}

}
