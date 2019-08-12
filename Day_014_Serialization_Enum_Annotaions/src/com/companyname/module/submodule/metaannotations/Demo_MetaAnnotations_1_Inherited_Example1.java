/*
 * Annotations are not inherited by default . We need to write separate annotations for separate classes.
 */
package com.companyname.module.submodule.metaannotations;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("rawtypes")
class country {
	
	String name;
	String capitalCity;
	List officialLanguages = new ArrayList<>();
	
	public void displayDetailes(){
		System.out.println(name);
		
	}
	
}

// We need to @ suppressWarning annotation even its present in the super class .
@SuppressWarnings("rawtypes")
class india extends country{

	List States = new ArrayList<>();
	
	
}

public class Demo_MetaAnnotations_1_Inherited_Example1 {

}



