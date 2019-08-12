/*
 * Annotations are not documented by default.
 * 
 * How to generate Java Documentation .
 * 
 * Go to menu bar "project button " beside "run"
 *  
 *  Generate javadoc .
 * 
 *  
 *  short cut alt+shift+j 
 */
package com.companyname.module.submodule.metaannotations;

import java.lang.annotation.Inherited;


/**
 * @author Dhara
 *
 */
@Inherited
@interface NonVetoPower2{

	boolean CanWar() default true;
}


/**
 * @author Dhara
 *
 */

/*
 * We can not see the @NonVetoPower2 for country 2
 */
@NonVetoPower2
class country2 {
	
	/**
	 * This is used to for country name
	 */
	String name;
	String capitalCity;
	
	public void displayDetailes(){
		System.out.println(name);
		
	}
}


/**
 * @author Dhara
 *
 */
class USA2 extends country2{

	
	
}

/**
 * @author Dhara
 *
 */
/**
 * @author Dhara
 *
 */
public class Demo_MetaAnnotations_2_Documented_Example1 {

}



