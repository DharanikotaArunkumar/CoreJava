package com.companyname.module.submodule.annotations;

import java.util.ArrayList;
import java.util.List;

public class Demo_Annotations_3_Suppress_Warnings_Example1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	
		@SuppressWarnings("rawtypes")
		List cricketTeamNames = new ArrayList();
		
		cricketTeamNames.add("India");
		cricketTeamNames.add("srikanka");
		//cricketTeamNames.add(1);
		
		
		System.out.println(cricketTeamNames);
		

	}

}
