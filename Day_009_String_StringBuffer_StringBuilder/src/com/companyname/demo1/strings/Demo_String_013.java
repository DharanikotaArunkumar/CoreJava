package com.companyname.demo1.strings;

public class Demo_String_013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str ="Hello";
		
		//  equals()
		// Returns True when equal , false when they are not equal , case sensitive
		System.out.println(str.equals("Hello"));
		System.out.println(str.equals("hello"));
		
		//equalsIgnoreCase()
		// Returns True when equal , false when they are not equal , case ignores
		System.out.println(str.equalsIgnoreCase("hello"));
		System.out.println(str.equalsIgnoreCase("hi"));
		
		//length()
		String str1 ="";
		System.out.println(str1.length());
		System.out.println(str.length());
		System.out.println(" ".length());
		
		//trim()
		// Removes the spaces leading and trailing spaces only
		
		System.out.println(" Welcome".trim());
		System.out.println("Welcome ".trim());
		System.out.println(" Welcome ".trim());
		System.out.println(" Wel come ".trim());
		System.out.println(" Welcome  to you ".trim());
		
		String ex1="Hello ";
		String ex2 ="Hello";
		
		if(ex1.equals(ex2)){
			System.out.println("login suces --------");
		}
				
		if(ex1!= null&&ex2.equals(ex1.trim())){
			System.out.println("login suces");
		}
				
		
		
		
		
		//indexOf()
		// Returns the first occurrence of index of the char or string , else return -ve value 
		System.out.println(("Hello world").indexOf('l'));
		
		System.out.println(("Hello world  Hello world ").indexOf("world"));
		
		System.out.println(("Hello world").indexOf('l',6));
		
		System.out.println(("Hello world  Hello world ").indexOf("world",10));
		
		System.out.println(("Hello world").indexOf('z'));	
		
		
		//String xml ="";
		//String tempCotent =xml.substring((xml.indexOf("<soapreayea")));
		
		System.out.println(("Hello world  Hello world ").indexOf("worlz"));
		
		System.out.println("Hello world ".indexOf(" "));
		
		
		//lastIndexOf()
		
		/*// Returns the last occurrence of index of the char or string , else return -ve value 
		
		System.out.println(("Hello world").lastIndexOf('l'));
		
		System.out.println(("Hello world  Hello world ").lastIndexOf("world"));
		
		System.out.println(("Hello world").lastIndexOf('l',6));
		
		System.out.println(("Hello world  Hello world ").lastIndexOf("world",10));
		
		System.out.println(("Hello world").lastIndexOf('z'));		
		
		System.out.println(("Hello world  Hello world ").lastIndexOf("worlz"));
		
		System.out.println("Hello world ".lastIndexOf(""));*/
		
		// charAt(int)
		// Returns the char at that index
		
		System.out.println(("Hello world").charAt(6));
		
		//toCharArray() returns the char array
		
		char[] charArray =str.toCharArray();
		
		
		for( char c:charArray){
		System.out.println(c);
		}
		
		
		//split(char)
		// splits the string with delimiter 
		String paragraph ="book1,book2,book3,book4,book5,book6,book7,book8 ";
		System.out.println(paragraph.length());
	
		String[] books =paragraph.split(",");	
		System.out.println(books.length);
		
		for(String b :books){
			System.out.println(b);
		}
		
		
		//substring
		//returns the partial content from the string .
		// 
		String country ="india won 2 times worldcup";
		System.out.println(country.substring(10));
		System.out.println(country.substring(12, 16));
		//System.out.println(country.substring(-1));
		//System.out.println(country.substring(18, 16)); // from is greater then the too index .
		
		//repalce 
		// it replaces the all the occurencs of the particular chare
		
		
		String country1 ="india won 2 times worldcup india won 2 times worldcup india won 2 times worldcup";
		System.out.println(country1.replace('i', 'I'));
		
		//to change the string to upper case 
		System.out.println(str.toUpperCase());
		
		//to change the string to lower case 
				System.out.println(str.toLowerCase());
				
		
		
		
	}

}
