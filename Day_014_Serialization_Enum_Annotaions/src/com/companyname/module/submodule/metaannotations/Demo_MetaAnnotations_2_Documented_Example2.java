/*
 * Annotations are not documented by default.
 * 
 * How to generate Java Documentation .
 * 
 * Go to menu bar "project button " beside "run"
 *  
 *  Generate javadoc .
 *  
 *  Let make documented by using @Documented
 *  
 */
package com.companyname.module.submodule.metaannotations;

import java.lang.annotation.Documented;

/**
 * @author Dhara
 *
 */
@Documented
@interface NonVetoPower3{

	boolean CanWar() default true;
}


/*
 * Now We can  see the @NonVetoPower3 for country 3 as its added with @Documented */
@NonVetoPower3
class country3 {
	
	
	
	String name;
	String capitalCity;
	
	public void displayDetailes(){
		System.out.println(name);
		
	}
}


class USA3 extends country3{

	
	
}

public class Demo_MetaAnnotations_2_Documented_Example2 {

}



