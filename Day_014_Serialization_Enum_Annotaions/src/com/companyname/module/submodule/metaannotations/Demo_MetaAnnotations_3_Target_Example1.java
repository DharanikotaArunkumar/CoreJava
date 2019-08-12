/*
 * @Retention is responsible to specify that how long an annotation type should be retained.
 */
package com.companyname.module.submodule.metaannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface NonVetoPower4{

	boolean CanWar() default true;
}


@NonVetoPower4
class country4 {
	
	String name;
	String capitalCity;
	
	public void displayDetailes(){
		System.out.println(name);
		
	}
}


class USA4 extends country4{

	
	
}

public class Demo_MetaAnnotations_3_Target_Example1 {

}



