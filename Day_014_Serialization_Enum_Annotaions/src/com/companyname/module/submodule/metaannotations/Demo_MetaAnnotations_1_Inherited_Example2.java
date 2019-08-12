/*
 * If you place @ inherited annotation before of annotation declaration all sub classes will be get this annotation .
 */
package com.companyname.module.submodule.metaannotations;

import java.lang.annotation.Inherited;

@Inherited
@interface NonVetoPower{

	boolean CanWar() default true;
}

@NonVetoPower
class country1 {
	
	String name;
	String capitalCity;
	
	public void displayDetailes(){
		System.out.println(name);
		
	}
}


class USA extends country1{

	
	
}

public class Demo_MetaAnnotations_1_Inherited_Example2 {

}



