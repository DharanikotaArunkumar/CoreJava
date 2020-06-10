package com.learnjava.topic35.defaultmethods.solution.api.implementation;

import com.learnjava.topic35.defaultmethods.problem.api.DeviceAPI;
import com.learnjava.topic35.defaultmethods.solution.api.AbstractDevice;

public class Laptop extends AbstractDevice implements DeviceAPI {

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
	
	@Override
	public boolean isBlueToothEnabled() {

		return true;
	}

}
