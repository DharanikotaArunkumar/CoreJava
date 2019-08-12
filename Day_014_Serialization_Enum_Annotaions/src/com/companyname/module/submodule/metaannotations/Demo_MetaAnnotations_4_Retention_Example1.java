/*
 * Target annotations says to which element its applicable .
 */
package com.companyname.module.submodule.metaannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.LOCAL_VARIABLE)
@interface NonVetoPower5{

	boolean CanWar() default true;
}


@NonVetoPower5
class country5 {
	
	String name;
	String capitalCity;
	
	public void displayDetailes(){
		System.out.println(name);
		
	}
}


class USA4 extends country4{

	
	
}

public class Demo_MetaAnnotations_4_Retention_Example1 {

}



