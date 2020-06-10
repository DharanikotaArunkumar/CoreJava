/*
 * Java added a new final class StringJoiner in java.util package.
 *  new StringJoiner(",") :- It is used to construct a sequence of characters separated by a delimiter ','.
 */

package com.learnjava.topic43.stringjoiner;

import java.util.StringJoiner;  
public class Demo_Date_001_StringJoiner {  
    public static void main(String[] args) {  
    	
        StringJoiner permanentVetoedNations = new StringJoiner(",");    // 1st constructor 
          
        // Adding values to StringJoiner  
        permanentVetoedNations.add("China");  
        permanentVetoedNations.add("France");  
        permanentVetoedNations.add("Russia");  
        permanentVetoedNations.add("United Kingdom");  
        permanentVetoedNations.add("United States");               
        
            
        System.out.println(" Permanent Vetoed Nations :- "+permanentVetoedNations);  
    }  
}  