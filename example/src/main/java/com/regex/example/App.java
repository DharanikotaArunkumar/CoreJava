package com.regex.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RegExUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	InputStream resourceAsStream = App.class.getClassLoader().getResourceAsStream("Demo.txt");    	
    	String string = IOUtils.toString(resourceAsStream );
    	
    	System.out.println("Before :");
    	System.out.println("------------------------");
    	System.out.println(string );
    	
    	Pattern pattern = Pattern.compile("#.*");
    	String afterRemove = RegExUtils.removeAll(string, pattern);
    	
    	System.out.println("After Removing Line stating with # :");
    	System.out.println("-----------------------");    	
    	System.out.println(afterRemove );
    	String finalOutPut = RegExUtils.replaceAll(afterRemove, Pattern.compile("(\r\n)+"), "\n");
    	
    	System.out.println("Final Rest Call Out Put :");
    	System.out.println("-----------------------");
    	System.out.println(finalOutPut );
    	
    	
    	
        
    }
}
