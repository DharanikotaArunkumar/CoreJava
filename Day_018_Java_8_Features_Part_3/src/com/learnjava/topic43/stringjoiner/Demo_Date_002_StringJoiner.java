/*
 * Java added a new final class StringJoiner in java.util package.
 * 
 * StringJoiner(CharSequence delimiter,CharSequence prefix,CharSequence suffix):- It is used to construct a sequence of characters 
 * separated by a delimiter and optionally starting with a supplied prefix
 * 
 */

package com.learnjava.topic43.stringjoiner;

import java.util.StringJoiner;  
public class Demo_Date_002_StringJoiner {  
    public static void main(String[] args) {  
    	
       
    	
    	StringJoiner permanentVetoedNations = new StringJoiner(","," Countries  ", " has veto power");    // 2nd constructor 
          
        // Adding values to StringJoiner  
        permanentVetoedNations.add("China");  
        permanentVetoedNations.add("France");  
        permanentVetoedNations.add("Russia");  
        permanentVetoedNations.add("United Kingdom");  
        permanentVetoedNations.add("United States");               
        
            
        System.out.println(" Permanent Vetoed Nations :- "+permanentVetoedNations);  
    }  
}  