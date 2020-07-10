/*
 * Target annotations says to which element its applicable .
 */
package com.companyname.module.submodule.metaannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})
@interface NonVetoPower5{

	//boolean CanWar() default true;
}


@NonVetoPower5
class country5 {
	
	@NonVetoPower5
	String name;
	String capitalCity;
	
	@NonVetoPower5
	public void displayDetailes(){
		
		int value =0 ;
		System.out.println(name);
		
	}
}


class USA4 extends country4{

	
	
}

public class Demo_MetaAnnotations_4_Retention_Example1 {

}



