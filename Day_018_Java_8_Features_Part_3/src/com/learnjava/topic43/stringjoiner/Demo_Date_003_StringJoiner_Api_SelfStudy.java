/*
 * StringJoiner methods
 * 
 */

package com.learnjava.topic43.stringjoiner;

import java.util.StringJoiner;  
public class Demo_Date_003_StringJoiner_Api_SelfStudy {  
    public static void main(String[] args) {  
    	
       
    	
    	StringJoiner permanentVetoedNations = new StringJoiner(",");    
    	System.out.println("Empty StringJoiner "+permanentVetoedNations);   // prints nothing
    	
    	
    	permanentVetoedNations.setEmptyValue("It is empty");   // setting empty
    	System.out.println("After setting Empty to StringJoiner "+permanentVetoedNations);   // prints It is empty
    	
        // Adding values to StringJoiner  
        permanentVetoedNations.add("China");  
        permanentVetoedNations.add("France");  
        permanentVetoedNations.add("Russia");  
        permanentVetoedNations.add("United Kingdom");  
        permanentVetoedNations.add("United States");          
      
        System.out.println("After adding values to StringJoiner "+permanentVetoedNations);   // prints values

        
        int length = permanentVetoedNations.length();   // Returns length of StringJoiner  
        System.out.println("No of Nations: "+length);  
          
        // 
        String str = permanentVetoedNations.toString();  // StringJoiner to String type  
        System.out.println(str); 
        
        
        
        StringJoiner presentTempVetoedNations = new StringJoiner(",");    
    	
        // Adding values to StringJoiner  
    	presentTempVetoedNations.add("Belgium");  
    	presentTempVetoedNations.add("Dominican Republic");  
    	presentTempVetoedNations.add("Germany");  
    	presentTempVetoedNations.add("Indonesia");  
    	presentTempVetoedNations.add("South Africa");    
    	
    	System.out.println("presentTempVetoedNations :"+presentTempVetoedNations); 
    	
    	
    	StringJoiner vetoedNations = new StringJoiner(",");      
    	vetoedNations.merge(presentTempVetoedNations);     // merging two StringJoiner
    	vetoedNations.merge(presentTempVetoedNations);
    	
    	System.out.println("vetoedNations :"+presentTempVetoedNations); 
    	
    	     
          
         
    }  
}  