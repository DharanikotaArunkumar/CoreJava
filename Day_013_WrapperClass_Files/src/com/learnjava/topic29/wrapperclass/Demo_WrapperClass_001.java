 
 // Wrapper class are the representation of the primitive data types in object form.
 // all wrapper class are sub class of the Number class . java.lang.Number
 // int-- java .lang.Interger
 //short-- java .lang.Short
 //double-- java .lang.Double
 //byte-- java .lang.Byte
 //long-- java .lang.Long
 //float-- java .lang.Float
 
 //char --java.lang.Charater
 // boolean -- java.lang.Boolean
 // if some frameworks expects the objects all the time thenthese class are usfull,
 

public class Demo_WrapperClass_1 {

	public static void main(String[] args) {
		
		//int i="10";
		Integer primitiveInt = new Integer(10);
		Integer objectInteger = new Integer("10");
		
		
		System.out.println(" Primitive value is "+primitiveInt);
		System.out.println(" Object value is "+objectInteger);
		
		
		//Wrapper class to in primitive
		int j= Integer.parseInt("10");
		int jjj =primitiveInt.intValue();
		
		String str = Integer.toString(primitiveInt);
		
		//Dataype -->wrapper class
		
		int k=10;
		Integer jj =Integer.valueOf(k);

	}

}
