package com.learnjava.topic35.defaultmethods.problem.api.implementation;

import com.learnjava.topic35.defaultmethods.problem.api.DeviceAPI;

public class Laptop implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "Windows";
	}

	@Override
	public String getMaxResolution() {
		
		return "1024";
	}

	@Override
	public String getBrand() {
		
		return "Dell";
	}

}
