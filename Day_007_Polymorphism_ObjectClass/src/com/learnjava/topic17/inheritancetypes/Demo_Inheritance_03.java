package com.learnjava.topic17.inheritancetypes;

/*
 * Hierarchical Inheritance 
 * 
 *   
 * 	 								IndianDefence
 *	  									|
 *	              ---------------------------------------------
 *				  |						|					  |
 *			IndianArmy	   			IndianNavy   		IndianAirforce
 *
 *
*/	


class IndianDefence{
	
	String defenceMinister;
	String motto;
	
	
	IndianDefence(){
		defenceMinister ="raj nath singh";
		
	}
	
}

class IndianArmy extends IndianDefence{
	String armyChief;
	int tanks;
	
	IndianArmy(){		
		armyChief = "General Dalbir Singh";
		tanks = 5000;
		motto = "Service Before Self";
		
	}
	
	
}

class IndianNavy extends IndianDefence{
	String navyChief;
	int warships;
	
	IndianNavy(){
		navyChief = "Admiral Sunil Lanba" ;
		warships = 1000;
		motto = "May the Lord of the Oceans be Auspicious Unto Us";
		
	}
}

class IndianAirforce extends IndianDefence{
	String airForceChief;
	int flight;
	
	IndianAirforce(){
		airForceChief = "Air Chief Marshal Arup Raha";
		flight = 3000;
		motto ="Touch the Sky with Glory";
	}
}

public class Demo_Inheritance_03  {
	
	public static void main(String[] args) {
		
		IndianArmy armyPerson = new IndianArmy();
		System.out.println(armyPerson.motto);
				
		IndianNavy navalPerson = new IndianNavy();
		System.out.println(navalPerson.motto);
		
		IndianAirforce airForcePerson = new IndianAirforce();
		System.out.println(airForcePerson.motto);
		
		
		

	}

}
